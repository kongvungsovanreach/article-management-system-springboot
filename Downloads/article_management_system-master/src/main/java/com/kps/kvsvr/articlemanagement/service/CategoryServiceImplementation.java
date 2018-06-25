package com.kps.kvsvr.articlemanagement.service;

import com.kps.kvsvr.articlemanagement.model.Category;
import com.kps.kvsvr.articlemanagement.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImplementation implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public void insert(Category category) {
        categoryRepository.insert(category);
    }
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    @Override
    public Category findOne(int id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        categoryRepository.delete(id);
    }

    @Override
    public void update(Category category) {
        categoryRepository.update(category);
    }
}
