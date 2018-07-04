package com.kshrd.service;

import com.kshrd.model.Category;
import com.kshrd.repository.CategoryRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@MapperScan("com.kshrd")
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
