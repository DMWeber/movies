package com.kreait.dto;

import com.kreait.entity.Movie;

public class MovieDTO {

    private Movie movie;

    public MovieDTO(Movie movie) {
        this.movie = movie;
    }

    public Long getId() {
        return movie.getId();
    }

    public String getTitle() {
        return movie.getTitle();
    }
}
