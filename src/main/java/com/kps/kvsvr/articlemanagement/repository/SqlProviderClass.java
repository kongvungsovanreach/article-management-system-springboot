package com.kps.kvsvr.articlemanagement.repository;

import com.kps.kvsvr.articlemanagement.model.ArticleFilter;
import org.apache.ibatis.jdbc.SQL;

public class SqlProviderClass {
    public String buildSql(ArticleFilter articleFilter){
        return new SQL(){{
            SELECT("*,cate_title");
            FROM("tbl_articles a");
            INNER_JOIN("tbl_categories c ON a.cate_id = c.cate_id");
            if(articleFilter.getTitle() != null){
                WHERE("a.title ILIKE '%'||#{title}||'%'");
            }
            if(articleFilter.getCate_id() != null){
                WHERE("a.cate_id = #{cate_id}");
            }
        }}.toString()+" limit 5 offset (#{page}-1)*5";
    }
}
