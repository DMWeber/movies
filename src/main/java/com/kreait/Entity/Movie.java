package com.kreait.Entity;

import java.util.Set;

public class Movie {
    private String title;

    private Long duration;

    public Set<Person> getPeople() {
        return people;
    }

    public Long getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    private Set<Person> people;
}
