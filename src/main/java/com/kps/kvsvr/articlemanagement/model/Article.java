package com.kps.kvsvr.articlemanagement.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Article {
    Integer id;
    @NotEmpty(message = "Title cannot be empty! ")
    String title;
    Category category;
    @NotEmpty(message = "Description cannot be empty!")
    String description;
    @NotEmpty(message = "Author cannot be empty!")
    String author;
    String thumbnail;
    String createdDate;

    public Article(@NotNull Integer id, @NotEmpty String title, Category category, @NotEmpty String description, @NotEmpty String author, String thumbnail, String createdDate) {
        this.id = id;
        this.title = title;
        this.category=category;
        this.description = description;
        this.author = author;
        this.thumbnail = thumbnail;
        this.createdDate = createdDate;
    }
    public Article(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
