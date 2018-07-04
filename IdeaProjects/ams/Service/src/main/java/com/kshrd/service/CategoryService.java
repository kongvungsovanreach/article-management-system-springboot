package com.kshrd.service;

import com.kshrd.model.Category;

import java.util.List;
public interface CategoryService {
    void insert(Category category);
    List<Category> findAll();
    Category findOne(int id);
    void delete(int id);
    void update(Category category);
}
