package com.rihem.movies.service;

import java.util.List;

import com.rihem.movies.entities.Genre;
import com.rihem.movies.entities.Movie;

public interface MovieService {
    Movie saveMovie(Movie m);
    Movie updateMovie(Movie m);
    void deleteMovie(Movie m);
    void deleteMovieById(Long id);
    Movie getMovie(Long id);
    List<Movie> getAllMovies();
    List<Movie> findByNomMovie(String nom);
    List<Movie> findByNomMovieContains(String nom);
    List<Movie> findByNomPrix(String nom, Double prix);
    List<Movie> findByGenre(Genre genre);
    List<Movie> findByGenreIdGen(Long id);
    List<Movie> findByOrderByNomMovieAsc();
    List<Movie> trierMoviesNomsPrix();
}
