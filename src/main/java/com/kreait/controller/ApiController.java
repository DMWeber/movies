package com.kreait.controller;

import com.kreait.Entity.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Set;

@RestController
public class ApiController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Set<Movie> get() {
        return Collections.emptySet();
    }
}
