//package com.kps.kvsvr.articlemanagement.repository;
//
//import com.kps.kvsvr.articlemanagement.model.Category;
//import org.springframework.stereotype.Repository;
//import java.util.ArrayList;
//import java.util.List;
//@Repository
//public class CategoryRepositoryImplementation implements CategoryRepository {
//    List<Category> categories = new ArrayList<>();
//
//    public CategoryRepositoryImplementation() {
//        for(int i=1;i<5;i++){
//            categories.add(new Category(i,"Category "+i));
//        }
//    }
//
//    @Override
//    public void insert(Category category) {
//        categories.add(category);
//    }
//
//    @Override
//    public List<Category> findAll() {
//        return categories;
//    }
//
//    @Override
//    public Category findOne(int id) {
//        for(Category c : categories){
//            if(c.getId()==id){
//                return c;
//            }
//        }
//        return null;
//    }
//}
