package com.rihem.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihem.movies.entities.Genre;
import com.rihem.movies.entities.Movie;
import com.rihem.movies.repos.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie m) {
        return movieRepository.save(m);
    }

    @Override
    public Movie updateMovie(Movie m) {
        return movieRepository.save(m);
    }

    @Override
    public void deleteMovie(Movie m) {
        movieRepository.delete(m);
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie getMovie(Long id) {
        return movieRepository.findById(id).get();
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> findByNomMovie(String nom) {
        return movieRepository.findByNomMovie(nom);
    }

    @Override
    public List<Movie> findByNomMovieContains(String nom) {
        return movieRepository.findByNomMovieContains(nom);
    }

    @Override
    public List<Movie> findByNomPrix(String nom, Double prix) {
        return movieRepository.findByNomPrix(nom, prix);    
    }

    @Override
    public List<Movie> findByGenre(Genre genre) {
        return movieRepository.findByGenre(genre);
    }

    @Override
    public List<Movie> findByGenreIdGen(Long id) {
        return movieRepository.findByGenreIdGenre(id);
    }

    @Override
    public List<Movie> findByOrderByNomMovieAsc() {
        return movieRepository.findByOrderByNomMovieAsc();
    }

    @Override
    public List<Movie> trierMoviesNomsPrix() {
        return movieRepository.trierMoviesNomsPrix();
    }

}
