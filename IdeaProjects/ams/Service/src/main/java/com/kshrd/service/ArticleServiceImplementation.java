package com.kshrd.service;
import com.kshrd.model.Article;
import com.kshrd.model.ArticleFilter;
import com.kshrd.repository.ArticleRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@MapperScan("com.kshrd")
public class ArticleServiceImplementation implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    public void insert(Article article) {
        articleRepository.insert(article);
    }
    public Article findOne(int id) {
        return articleRepository.findOne(id);
    }
    public List<Article> findAllLimit(int page) {
        return articleRepository.findAllLimit(page);
    }
    public List<Article> findAll() {
        return articleRepository.findAll();
    }
    public void delete(int id) {
        articleRepository.delete(id);
    }
    public void update(Article article) {
        articleRepository.update(article);
    }
    public List<Article> filterArticle(ArticleFilter articleFilter) {
        return articleRepository.findFilter(articleFilter);
    }
}
