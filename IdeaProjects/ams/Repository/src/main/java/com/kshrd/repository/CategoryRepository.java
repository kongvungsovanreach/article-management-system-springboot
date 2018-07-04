package com.kshrd.repository;

import com.kshrd.model.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CategoryRepository {
    @Insert("INSERT INTO tbl_categories(cate_title) VALUES(#{category})")
    void insert(Category category);
    @Select("SELECT * from tbl_categories")
    @Results(value ={
            @Result(property = "id", column = "cate_id"),
            @Result(property = "category", column = "cate_title")
    })
    List<Category> findAll();
    @Select("SELECT * from tbl_categories where cate_id=#{id}")
    @Results(value ={
            @Result(property = "id", column = "cate_id"),
            @Result(property = "category", column = "cate_title")
    })
    Category findOne(int id);

    @Delete("Delete from tbl_categories where cate_id=#{id}")
    void delete(int id);
    @Update("UPDATE tbl_categories SET  cate_title=#{category} where cate_id=#{id}")
    void update(Category category);
}
