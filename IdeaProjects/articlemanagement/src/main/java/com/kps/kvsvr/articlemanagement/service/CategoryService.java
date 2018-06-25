package com.kps.kvsvr.articlemanagement.service;

import com.kps.kvsvr.articlemanagement.model.Category;
import java.util.List;
public interface CategoryService {
    void insert(Category category);
    List<Category> findAll();
    Category findOne(int id);
    void delete(int id);
    void update(Category category);
}
