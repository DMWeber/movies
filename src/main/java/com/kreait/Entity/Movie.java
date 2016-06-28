package com.kreait.entity;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    // duration in minutes
    private Integer duration;

    private Integer publicationYear;

    @ManyToMany
    private List<Person> people;

    @ElementCollection
    @CollectionTable(
            name = "MOVIEIMAGE",
            joinColumns = @JoinColumn(name = "MOVIE_ID")
    )
    private List<Image> imageUrls;

    public Movie() {
    }

    private Movie(String title, Integer duration, Integer publicationYear, List<Person> people, List<Image> imageUrls) {
        this.title = title;
        this.duration = duration;
        this.publicationYear = publicationYear;
        this.people = people;
        this.imageUrls = imageUrls;
    }

    public Long getId() {
        return id;
    }

    public List<Person> getPeople() {
        return people;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public List<Image> getImageUrls() {
        return imageUrls;
    }

    public static Movie create(String title, Integer duration, Integer publicationYear, List<Person> people, List<Image> imageUrls) {
        return new Movie(title, duration, publicationYear, people, imageUrls);
    }
}
