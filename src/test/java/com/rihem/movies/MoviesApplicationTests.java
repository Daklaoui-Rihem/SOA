package com.rihem.movies;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rihem.movies.entities.Genre;
import com.rihem.movies.entities.Movie;
import com.rihem.movies.repos.MovieRepository;

@SpringBootTest
class MoviesApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

	@Test
	public void testCreateMovie() {
		Movie movie = new Movie("Fight Club", 250.00, new Date());
		movieRepository.save(movie);
	}

	@Test
	public void testFindMovie() {
		Movie m = movieRepository.findById(1L).get();
		System.out.println(m);
	}

	@Test
	public void testUpdateMovie() {
		Movie m = movieRepository.findById(1L).get();
		m.setPrixMovie(1000.0);
		movieRepository.save(m);
	}

	@Test
	public void testDeleteMovie() {
		movieRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousMovies() {
		List<Movie> mov = movieRepository.findAll();
		for (Movie m : mov) {
			System.out.println(m);
		}
	}

	@Test
	public void testFindMovieByName() {
		List<Movie> movies = movieRepository.findByNomMovie("Fight Club");
		for (Movie m : movies) {
			System.out.println(m);
		}
	}

	@Test
	public void testFindMovieByNameContains() {
		List<Movie> movies = movieRepository.findByNomMovieContains("a");
		for (Movie m : movies) {
			System.out.println(m);
		}
	}

	@Test
	public void testfindByNomPrix() {
		List<Movie> mov = movieRepository.findByNomPrix("Fight Club", 100.00);
		for (Movie m : mov) {
			System.out.println(m);
		}
	}

	@Test
	public void testfindByGenre() {
		Genre gen = new Genre();
		gen.setIdGenre(1L);
		List<Movie> mov = movieRepository.findByGenre(gen);
		for (Movie m : mov) {
			System.out.println(m);
		}
	}

	@Test
	public void findByGenreIdGenre() {
		List<Movie> movs = movieRepository.findByGenreIdGenre(1L);
		for (Movie p : movs) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByOrderByNomMovieAsc() {
		List<Movie> movs = movieRepository.findByOrderByNomMovieAsc();
		for (Movie m : movs) {
			System.out.println(m);
		}
	}

	@Test
	public void testTrierMoviesNomsPrix() {
		List<Movie> movs = movieRepository.trierMoviesNomsPrix();
		for (Movie m : movs) {
			System.out.println(m);
		}
	}
}
