package com.zengcode.els;

import com.zengcode.els.model.Genre;
import com.zengcode.els.model.Movie;
import com.zengcode.els.repo.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private MovieService movieService;

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

        Application application = ctx.getBean(Application.class);
        application.movieService.getByName("abc");

        //application.addSomeMovies();

        System.out.println("name ===>>> " + application.movieService.getByName("Star Wars"));
        System.out.println("id ===>>> " + application.movieService.getById("2"));
        System.out.println("Genre name  ===>>> " + application.movieService.getByGenreName("ROMANCE")); //Nested
    }

    private void addSomeMovies() {
        Movie starWars = getFirstMovie();
        movieService.addMovie(starWars);

        Movie princessBride = getSecondMovie();
        movieService.addMovie(princessBride);
    }

    private Movie getSecondMovie() {
        Movie secondMovie = new Movie();
        secondMovie.setId("2");
        secondMovie.setName("The Princess Bride");

        List<Genre> princessPrideGenre = new ArrayList< Genre >();
        princessPrideGenre.add(new Genre("ACTION"));
        princessPrideGenre.add(new Genre("ROMANCE"));
        secondMovie.setGenre(princessPrideGenre);

        return secondMovie;
    }


    private Movie getFirstMovie() {
        Movie firstMovie = new Movie();
        firstMovie.setId("1");
        firstMovie.setName("Star Wars");

        List < Genre >  starWarsGenre = new ArrayList < Genre >();
        starWarsGenre.add(new Genre("ACTION"));
        starWarsGenre.add(new Genre("SCI_FI"));
        firstMovie.setGenre(starWarsGenre);

        return firstMovie;
    }


}
