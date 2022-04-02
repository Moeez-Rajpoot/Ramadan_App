package com.example.laundryui.model;

public class Item {
    private int image;
    private String name;
    private String location;
    private String price;

    public Item(int image, String name, String location, String price) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
