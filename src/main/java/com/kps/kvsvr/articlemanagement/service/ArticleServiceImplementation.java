package com.kps.kvsvr.articlemanagement.service;

import com.kps.kvsvr.articlemanagement.model.Article;
import com.kps.kvsvr.articlemanagement.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
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
    public List<Article> search(String search) {
        System.out.println(search);
        return articleRepository.search(search);
    }
    @Override
    public void delete(int id) {
        articleRepository.delete(id);
    }
    @Override
    public void update(Article article) {
        articleRepository.update(article);
    }
}
