package com.kreait.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Image {
    private String url;

    public String getUrl() {
        return url;
    }

    public Image() {
    }

    private Image(String url) {
        this.url = url;
    }

    public static Image create(String url) {
        return new Image(url);
    }
}
