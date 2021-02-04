package com.kauemagid.lists.model;

public class Film {

    private String title;
    private String kind;
    private String year;

    public  Film(){

    }

    public Film(String title, String kind, String year) {
        this.title = title;
        this.kind = kind;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
