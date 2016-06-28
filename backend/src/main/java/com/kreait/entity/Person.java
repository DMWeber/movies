package com.kreait.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Profession role;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "people")
    private Set<Movie> movies;

    @Embedded
    private Image imageUrl;

    public Person() {
    }

    private Person(String name, Profession role, Image imageUrl) {
        this.name = name;
        this.role = role;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Profession getRole() {
        return role;
    }

    public Image getImageUrl() {
        return imageUrl;
    }

    public static Person create(String name, Profession role, Image imageUrl) {
        return new Person(name, role, imageUrl);
    }

    public enum Profession {
        Director, Actor, Producer
    }
}
