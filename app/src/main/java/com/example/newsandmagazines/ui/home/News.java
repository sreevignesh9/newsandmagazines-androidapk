package com.example.newsandmagazines.ui.home;

public class News {
    private String title;
    private String tail_text;
    private int cur_image;

    // Constructor
    public News(String title, String tail_text, int cur_image) {
        this.title = title;
        this.tail_text = tail_text;
        this.cur_image = cur_image;
    }

    // Getter and Setter
    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String gettail_text() {
        return tail_text;
    }

    public void settail_text(String tailtext) {
        this.tail_text = tailtext;
    }

    public int getcur_image() {
        return cur_image;
    }

    public void setcur_image(int cur_image) {
        this.cur_image = cur_image;
    }
}
