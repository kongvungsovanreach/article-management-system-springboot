package com.kshrd.model;

public class ArticleFilter {
    String title;
    Integer cate_id;
    Integer page;
    Integer p;

    public ArticleFilter(String title, Integer cate_id, Integer page) {
        this.title = title;
        this.cate_id = cate_id;
        this.page = page;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "ArticleFilter{" +
                "title='" + title + '\'' +
                ", cate_id=" + cate_id +
                ", page=" + page +
                ", p=" + p +
                '}';
    }
}
