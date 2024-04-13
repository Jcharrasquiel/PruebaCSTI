package com.prueba.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.prueba.demo.model.Film;

public class FilmTest {

    @Test
    public void testGettersAndSetters() {
        //Arrange
        String episodeId = "1";
        String title = "Star Wars";
        String releaseDate = "1977-05-25";
        //Act
        Film film = new Film();
        film.setEpisode_id(episodeId);
        film.setTitle(title);
        film.setRelease_date(releaseDate);
        //Assert
        assertEquals(episodeId, film.getEpisode_id());
        assertEquals(title, film.getTitle());
        assertEquals(releaseDate, film.getRelease_date());
    }
}