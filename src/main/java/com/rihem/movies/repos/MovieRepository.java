package com.rihem.movies.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rihem.movies.entities.Genre;
import com.rihem.movies.entities.Movie;
import java.util.List;

@RepositoryRestResource(path = "rest")
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByNomMovie(String nomMovie);

    List<Movie> findByNomMovieContains(String nomMovie);

    /*
     * @Query("select m from Movie m where m.nomMovie like %?1 and m.prixMovie > ?2"
     * )
     * List<Movie> findByNomPrix(String nom, Double prix);
     */

    @Query("select m from Movie m where m.nomMovie like %:nom and m.prixMovie > :prix")
    List<Movie> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

    @Query("select m from Movie m where m.genre = ?1")
    List<Movie> findByGenre(Genre genre);

    List<Movie> findByGenreIdGenre(Long id);

    List<Movie> findByOrderByNomMovieAsc();

    @Query("select m from Movie m order by m.nomMovie ASC, m.prixMovie DESC")
    List<Movie> trierMoviesNomsPrix();

}
