package com.Silvia.entity;

import java.util.Locale;

public class tokoKecilEntity {
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Locale.Category getCategory() {
        return category;
    }

    public void setCategory(Locale.Category category) {
        this.category = category;
    }

    private String nama;
    private double price;
    private Locale.Category category;

}