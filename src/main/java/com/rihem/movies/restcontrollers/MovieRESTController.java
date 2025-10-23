package com.rihem.movies.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rihem.movies.entities.Movie;
import com.rihem.movies.service.MovieService;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MovieRESTController {

    @Autowired
    MovieService movieService;

    @RequestMapping(method = RequestMethod.GET)
    List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Movie getMovieById(@PathVariable("id") Long id) {
        return movieService.getMovie(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Movie updateMovie(@RequestBody Movie movie) {
        return movieService.updateMovie(movie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMovie(@PathVariable("id") Long id) {
        movieService.deleteMovieById(id);
    }

    @RequestMapping(value = "/prodsgenre/{idGenre}", method = RequestMethod.GET)
    public List<Movie> getMoviesByGenreId(@PathVariable("idGenre") Long idGenre) {
        return movieService.findByGenreIdGen(idGenre);
    }

    @RequestMapping(value = "/movsgenre/{idGenre}", method = RequestMethod.GET)
    public List<Movie> findByGenreIdGenre(@PathVariable("idGenre") Long idGenre) {
        return movieService.findByGenreIdGen(idGenre);
    }

    @RequestMapping(value = "/movsByName/{nom}", method = RequestMethod.GET)
    public List<Movie> findByNomMovieContains(@PathVariable("nom") String nom) {
        return movieService.findByNomMovieContains(nom);
    }

}
