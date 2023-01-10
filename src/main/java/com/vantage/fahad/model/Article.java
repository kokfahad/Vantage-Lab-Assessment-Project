package com.vantage.fahad.model;

import lombok.Data;

@Data
public class Article {
    private String url;
    private String topic;
    private String title;
    private String author;
    private String date;
}
