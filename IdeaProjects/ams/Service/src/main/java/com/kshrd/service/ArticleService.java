package com.kshrd.service;

import com.kshrd.model.Article;
import com.kshrd.model.ArticleFilter;

import java.util.List;

public interface ArticleService {
    void insert(Article article);
    Article findOne(int id);
    List<Article> findAllLimit(int page);
    List<Article> findAll();
    void delete(int id);
    void update(Article article);
    List<Article> filterArticle(ArticleFilter articleFilter);
}
