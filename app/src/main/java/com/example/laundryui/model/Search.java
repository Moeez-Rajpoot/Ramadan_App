package com.example.laundryui.model;

public class Search {
    private int image;
    private String name;
    private String Score;
    private String location;

    public Search(int image, String name, String score, String location) {
        this.image = image;
        this.name = name;
        Score = score;
        this.location = location;
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

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
