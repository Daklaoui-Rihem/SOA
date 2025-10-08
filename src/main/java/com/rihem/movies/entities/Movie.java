package com.rihem.movies.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long idMovie;
    private String nomMovie;
    private Double prixMovie;
    private Date dateCreation;

    @ManyToOne
    private Genre genre;


    public Movie() {
        super();
    }

    public Movie(String nomMovie, Double prixMovie, Date dateCreation) {
        super();
        this.nomMovie = nomMovie;
        this.prixMovie = prixMovie;
        this.dateCreation = dateCreation;
    }

    public Long getIdMovie() {
        return idMovie;
    }
    public void setIdMovie(Long idMovie) {
        this.idMovie = idMovie;
    }
    public String getNomMovie() {
        return nomMovie;
    }
    public void setNomMovie(String nomMovie) {
        this.nomMovie = nomMovie;
    }
    public Double getPrixMovie() {
        return prixMovie;
    }
    public void setPrixMovie(Double prixMovie) {
        this.prixMovie = prixMovie;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie [idMovie=" + idMovie + ", nomMovie=" + nomMovie + ", prixMovie=" + prixMovie + ", dateCreation="
                + dateCreation + "]";
    }
    
    
}
