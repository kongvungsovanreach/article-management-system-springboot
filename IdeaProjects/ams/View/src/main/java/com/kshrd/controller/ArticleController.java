package com.kshrd.controller;

import com.kshrd.model.Article;
import com.kshrd.model.ArticleFilter;
import com.kshrd.model.Category;
import com.kshrd.service.ArticleService;
import com.kshrd.service.CategoryService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    CategoryService categoryService;
    @Value("${serverPath}")
    String serverPath;
    @Value("${clientPath}")
    String clientPath;
    @GetMapping("/article")
    public String articleView(Model model, ArticleFilter articleFilter){
        System.out.println(articleFilter);
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("articleList",articleService.filterArticle(articleFilter));
        model.addAttribute("pageNum",(articleService.findAll().size()/5));
        if(articleFilter.getPage() !=null){
            if(articleFilter.getPage()==articleService.findAll().size()/5+1){
                model.addAttribute("nextPage",articleService.findAll().size()/5+1);
                model.addAttribute("prevPage",articleFilter.getPage()-1);
            }
            else if(articleFilter.getPage()==1){
                model.addAttribute("prevPage",1);
                model.addAttribute("nextPage",articleFilter.getPage()+1);
            }
            else {
                model.addAttribute("prevPage",articleFilter.getPage()-1);
                model.addAttribute("nextPage",articleFilter.getPage()+1);
            }
        }else {
            model.addAttribute("nextPage",1);
            model.addAttribute("prevPage",1);
        }
        model.addAttribute("filter",articleFilter);
        return "articleView";
    }

    @GetMapping("/category")
    public String cateView(Model model){
        model.addAttribute("articleList",categoryService.findAll());
        return "cateView";
    }
    @GetMapping("/add")
    public String addArticle( Model model){
        model.addAttribute("article",new Article());
        model.addAttribute("categories",categoryService.findAll());
        return "insertForm";
    }
    @GetMapping("/addCate")
    public String addCategory( Model model){
        model.addAttribute("category",new Category());
        model.addAttribute("addForm",true);
        return "cateinsert";
    }
    @PostMapping("/addCate")
    public String addCate(@Valid @ModelAttribute Category category, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("addForm",true);
            return "cateinsert";
        }
        categoryService.insert(category);
        return "redirect:/category";
    }
    @GetMapping("/editCate/{id}")
    public String editCategory( Model model, @PathVariable("id") int id){
        model.addAttribute("category",categoryService.findOne(id));
        model.addAttribute("addForm",false);
        return "cateinsert";
    }
    @PostMapping("/editCate")
    public String editCate( @Valid @ModelAttribute Category category,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("addForm",false);
            return "cateinsert";
        }
        categoryService.update(category);
        return "redirect:/category";
    }
    @PostMapping("/add")
    public String insertRecord(Model model,@RequestParam("file") MultipartFile file , @Valid @ModelAttribute Article article, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            model.addAttribute("categories",categoryService.findAll());
            return "insertForm";
        }else {
            article.setCategory(categoryService.findOne(article.getCategory().getId()));
           if(!file.isEmpty()){
               try {
                   Files.copy(file.getInputStream(), Paths.get(serverPath,file.getOriginalFilename()));
                   article.setThumbnail(clientPath+file.getOriginalFilename());
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }else {
               article.setThumbnail(clientPath+"noImage.png");
           }

            articleService.insert(article);
            return "redirect:/article";
        }
    }
    @GetMapping("/viewOne/{id}")
    public String viewOne(@PathVariable("id") int id, Model model){
        model.addAttribute("obj",articleService.findOne(id));
        return "viewOne";
    }
    @GetMapping("/viewCateOne/{id}")
    public String viewCateOne(@PathVariable("id") int id, Model model){
        model.addAttribute("obj",categoryService.findOne(id));
        return "viewCateOne";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        articleService.delete(id);
        return "redirect:/article";
    }

    @GetMapping("/catedelete/{id}")
    public String catedelete(@PathVariable("id") int id){
        categoryService.delete(id);
        return "redirect:/category";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        model.addAttribute("article",articleService.findOne(id));
        model.addAttribute("categories",categoryService.findAll());
        return "edit";
    }
    @PostMapping("/edit")
    public String editRecord(@ModelAttribute Article article, MultipartFile file){
        if(!file.isEmpty()){
            try {
                article.setThumbnail(clientPath+file.getOriginalFilename());
                Files.copy(file.getInputStream(), Paths.get(serverPath,file.getOriginalFilename()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            article.setThumbnail(articleService.findOne(article.getId()).getThumbnail());
        }
        article.setCategory(categoryService.findOne(article.getCategory().getId()));
        articleService.update(article);
        return "redirect:/article";
    }
}