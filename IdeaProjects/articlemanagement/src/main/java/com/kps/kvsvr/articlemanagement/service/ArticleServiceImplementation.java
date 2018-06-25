package com.kps.kvsvr.articlemanagement.service;

import com.kps.kvsvr.articlemanagement.model.Article;
import com.kps.kvsvr.articlemanagement.model.ArticleFilter;
import com.kps.kvsvr.articlemanagement.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
