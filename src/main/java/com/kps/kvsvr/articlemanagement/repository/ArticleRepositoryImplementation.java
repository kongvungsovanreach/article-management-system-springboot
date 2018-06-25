//package com.kps.kvsvr.articlemanagement.repository;
//
//import com.github.javafaker.Faker;
//import com.kps.kvsvr.articlemanagement.model.Article;
//import com.kps.kvsvr.articlemanagement.model.Category;
//import org.springframework.stereotype.Repository;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//@Repository
//public class ArticleRepositoryImplementation implements ArticleRepository {
//    List<Article> articleList = new ArrayList<>();
//    ArticleRepositoryImplementation(){
//        Faker faker = new Faker();
//        for(int i=1;i<5;i++){
//            articleList.add(new Article(i,faker.book().title(),new Category(i,"Category "+i),faker.book().title(),faker.book().author(),"http://www.catbreedslist.com/cat-wallpapers/Persian-kitten-grass-white-2560x1600.jpg",new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
//        }
//    }
//    public void insert(Article article) {
//        articleList.add(article);
//    }
//
//    public Article findOne(int id) {
//        for(Article article: articleList){
//            if (article.getId()==id){
//                return article;
//            }
//        }
//        return null;
//    }
//
//    public List<Article> findAll() {
//        return articleList ;
//    }
//
//    public void delete(int id) {
//        for(Article article:articleList){
//            if(article.getId()==id){
//                articleList.remove(articleList.indexOf(article));
//                return;
//            }
//        }
//    }
//
//    @Override
//    public void update(Article article) {
//        System.out.println("In already");
//        for(Article article1:articleList){
//            System.out.println(article1.getId()+"     "+article.getId());
//            if(article1.getId().intValue()==article.getId().intValue()){
//                System.out.println("Fuck");
//                article1.setTitle(article.getTitle());
//                article1.setDescription(article.getDescription());
//                article1.setAuthor(article.getAuthor());
//                article1.setCreatedDate(article.getCreatedDate());
//                article1.setCategory(article.getCategory());
//                System.out.println("aaaaaaa");
//                if(article.getThumbnail() !=null){
//                        new File("/Users/reachshare/Desktop",article1.getThumbnail()).delete();
//                        article1.setThumbnail(article.getThumbnail());
//                    System.out.println("sdfsdd");
//                }
//                return;
//            }
//        }
//    }
//}
