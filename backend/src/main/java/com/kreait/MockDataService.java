package com.kreait;

import com.kreait.entity.Image;
import com.kreait.entity.Movie;
import com.kreait.entity.Person;
import com.kreait.repository.MovieRepository;
import com.kreait.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class MockDataService implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private PersonRepository personRepository;

    private Set<Person> people;
    private List<Movie> movies;

    /**
     * This event is executed as late as conceivably possible to indicate that
     * the application is ready to service requests.
     */
    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {

        people = new HashSet<>();
        movies = new ArrayList<>();

        // Over The Top

        Person stallone = Person.create("Sylvester Stallone", Person.Profession.Actor, Image.create("http://ia.media-imdb.com/images/M/MV5BMjdiMTgxMDItYzhiZi00ODJiLWI5ZWItOWRkZWUwOGMyZTRlXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_.jpg"));

        List<Person> overTheTopPeople = new ArrayList<>();
        overTheTopPeople.add(stallone);
        people.addAll(overTheTopPeople);

        List<Image> overTheTopImages = new ArrayList<>();
        overTheTopImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BNmM1NDRjNGMtY2VjOS00YzYzLWJiYjAtNzlkZmM2MzRiZGRkXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_SX691_CR0,0,691,999_AL_.jpg"));
        overTheTopImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMTQ2MTQyMDYwM15BMl5BanBnXkFtZTgwNzI2Mjc2MjE@._V1_SY1000_CR0,0,1485,1000_AL_.jpg"));

        Movie overTheTop = Movie.create("Over the Top", 93, 1987, overTheTopPeople, overTheTopImages);
        movies.add(overTheTop);

        // Fifth Element

        Person besson = Person.create("Luc Besson", Person.Profession.Director, Image.create("http://ia.media-imdb.com/images/M/MV5BMTAwNzE4Njg0NTFeQTJeQWpwZ15BbWU3MDk0MDEyMDc@._V1_SY1000_CR0,0,704,1000_AL_.jpg"));
        Person willis = Person.create("Bruce Willis", Person.Profession.Actor, Image.create("http://ia.media-imdb.com/images/M/MV5BMjA0MjMzMTE5OF5BMl5BanBnXkFtZTcwMzQ2ODE3Mw@@._V1_.jpg"));
        Person oldman = Person.create("Gary Oldman", Person.Profession.Actor, Image.create("http://ia.media-imdb.com/images/M/MV5BMTc3NTM4MzQ5MV5BMl5BanBnXkFtZTcwOTE4MDczNw@@._V1_SY1000_CR0,0,678,1000_AL_.jpg"));
        Person jovovich = Person.create("Milla Jovovich", Person.Profession.Actor, Image.create("http://ia.media-imdb.com/images/M/MV5BNzA1Nzc4NjYwNV5BMl5BanBnXkFtZTcwNjA2NjY1Mg@@._V1_SY1000_CR0,0,790,1000_AL_.jpg"));

        List<Person> fifthElementPeople = new ArrayList<>();
        fifthElementPeople.add(besson);
        fifthElementPeople.add(willis);
        fifthElementPeople.add(oldman);
        fifthElementPeople.add(jovovich);
        people.addAll(fifthElementPeople);

        List<Image> fifthElementImages = new ArrayList<>();
        fifthElementImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMTkzOTkwNTI4N15BMl5BanBnXkFtZTYwMDIzNzI5._V1_.jpg"));
        fifthElementImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMTg4MTQ4ODk1MV5BMl5BanBnXkFtZTgwNDc2Mzg5MDE@._V1_SY1000_CR0,0,1482,1000_AL_.jpg"));
        fifthElementImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMjAzNTY5MjcxMF5BMl5BanBnXkFtZTgwNzc2Mzg5MDE@._V1_SY1000_CR0,0,1482,1000_AL_.jpg"));
        fifthElementImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMTQ2OTI3NTAzOV5BMl5BanBnXkFtZTgwOTc2Mzg5MDE@._V1_SY1000_CR0,0,1501,1000_AL_.jpg"));

        Movie fifthElement = Movie.create("The Fifth Element", 126, 1997, fifthElementPeople, fifthElementImages);
        movies.add(fifthElement);

        // Léon

        Person reno = Person.create("Jean Reno", Person.Profession.Actor, Image.create("http://ia.media-imdb.com/images/M/MV5BMTgzNjA1MjY2M15BMl5BanBnXkFtZTYwMjgzOTk0._V1_.jpg"));
        Person portman = Person.create("Natalie Portman", Person.Profession.Actor, Image.create("http://ia.media-imdb.com/images/M/MV5BMTQ3ODE3Mjg1NV5BMl5BanBnXkFtZTcwNzA4ODcxNA@@._V1_SY1000_SX746_AL_.jpg"));

        List<Person> leonPeople = new ArrayList<>();
        leonPeople.add(reno);
        leonPeople.add(portman);
        leonPeople.add(besson);
        people.addAll(leonPeople);

        List<Image> leonImages = new ArrayList<>();
        leonImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMTMwMDY0MTYyMF5BMl5BanBnXkFtZTcwMzI2NDkxNA@@._V1_SY1000_CR0,0,694,1000_AL_.jpg"));
        leonImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMTM1MDcxNDI0NV5BMl5BanBnXkFtZTcwNjI2NDkxNA@@._V1_SY1000_CR0,0,1472,1000_AL_.jpg"));
        leonImages.add(Image.create("http://ia.media-imdb.com/images/M/MV5BMjIxMDAxNTE2N15BMl5BanBnXkFtZTcwNTI2NDkxNA@@._V1_SY1000_CR0,0,680,1000_AL_.jpg"));

        Movie leon = Movie.create("Léon", 110, 1994, leonPeople, leonImages);
        movies.add(leon);

        // Persist

        this.personRepository.save(people);
        this.movieRepository.save(movies);

        return;
    }

}
