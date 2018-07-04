package com.kps.kvsvr.articlemanagement.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Category {
    public int id;
    @NotEmpty(message = "Category name cannot be null!")
    public String category;
    public Category() {
    }
    public Category(int id, String category) {
        this.id = id;
        this.category = category;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}
