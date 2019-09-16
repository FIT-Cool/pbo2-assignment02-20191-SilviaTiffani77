package com.Silvia.entity;

import jdk.jfr.Category;

import java.util.Locale;

public class Item {
    private String name;
    private int price;
    private Category category;

    public Item() {
    }

    public Item(String name, int price, String categoryName) {
        this.name = name;
        this.price = price;
        this.category.setName(categoryName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}