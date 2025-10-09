package com.rihem.movies.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomMov", types = { Movie.class })
public interface MovieProjection {

    public String getNomMovie();

}
