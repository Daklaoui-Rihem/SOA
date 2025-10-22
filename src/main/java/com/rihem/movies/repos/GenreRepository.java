package com.rihem.movies.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rihem.movies.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}