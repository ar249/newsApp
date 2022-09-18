package com.example.newsApp;



import java.util.ArrayList;
import java.util.Collection;

public class mainNews {

    private String status;
    private String totalResults;
    private ArrayList<ModelClass> articles;

    public mainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public Collection<? extends com.example.newsApp.ModelClass> getArticles() {
        return articles;
    }
}
