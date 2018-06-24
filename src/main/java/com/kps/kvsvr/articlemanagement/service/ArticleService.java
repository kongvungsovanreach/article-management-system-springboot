package com.kps.kvsvr.articlemanagement.service;

import com.kps.kvsvr.articlemanagement.model.Article;

import java.util.List;
public interface ArticleService {
    void insert(Article article);
    Article findOne(int id);
    List<Article> findAllLimit(int page);
    List<Article> findAll();
    List<Article> search(String search);
    void delete(int id);
    void update(Article article);
}
