package com.kps.kvsvr.articlemanagement.repository;
import com.kps.kvsvr.articlemanagement.model.Article;
import com.kps.kvsvr.articlemanagement.model.ArticleFilter;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ArticleRepository {
    @Select("SELECT *,cate_title from tbl_articles a INNER JOIN tbl_categories c ON a.cate_id = c.cate_id  limit 5 offset #{page}*5 ")
    @Results(value ={
            @Result(property = "category.id", column = "cate_id"),
            @Result(property = "category.category", column = "cate_title")
    })
    List<Article> findAllLimit(int page);
    @Select("SELECT *,cate_title from tbl_articles a INNER JOIN tbl_categories c ON a.cate_id = c.cate_id")
    @Results(value ={
            @Result(property = "category.id", column = "cate_id"),
            @Result(property = "category.category", column = "cate_title")
    })
    List<Article> findAll();
    @Select("SELECT *,cate_title from tbl_articles a INNER JOIN tbl_categories c ON a.cate_id = c.cate_id where a.title LIKE  '%'||#{search}||'%'")
    @Results(value ={
            @Result(property = "category.id", column = "cate_id"),
            @Result(property = "category.category", column = "cate_title")
    })
    @Delete("Delete from tbl_articles where id=#{id}")
    void delete(int id);
    @Update("UPDATE tbl_articles SET  title=#{title}, description=#{description}, author=#{author}, thumbnail=#{thumbnail},  cate_id=#{category.id} where id=#{id}")
    void update(Article article);
    @Insert("INSERT INTO tbl_articles(title, description, author, thumbnail,cate_id) VALUES(#{title},#{description},#{author},#{thumbnail},#{category.id})")
    void insert(Article article);
    @Select("SELECT *,cate_title from tbl_articles a INNER JOIN tbl_categories c ON a.cate_id = c.cate_id where id=#{id}")
    @Results(value ={
            @Result(property = "category.id", column = "cate_id"),
            @Result(property = "category.category", column = "cate_title")
    })
    Article findOne(int id);
    @SelectProvider(method = "buildSql",type = SqlProviderClass.class)
    @Results(value ={
            @Result(property = "category.id", column = "cate_id"),
            @Result(property = "category.category", column = "cate_title")
    })
    List<Article> findFilter(ArticleFilter articleFilter);

}
