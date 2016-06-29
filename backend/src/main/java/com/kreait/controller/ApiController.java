package com.kreait.controller;

import com.kreait.dto.MovieDTO;
import com.kreait.entity.Movie;
import com.kreait.entity.Person;
import com.kreait.repository.MovieRepository;
import com.kreait.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    PersonRepository personRepository;


    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<MovieDTO> getAllMovies() {

        List<MovieDTO> dtos = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            dtos.add(new MovieDTO(movie));
        }
        return dtos;
    }

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
    public Movie getSinglyMovie(@PathVariable("id") Long id) {

        return movieRepository.findOne(id);
    }

}
