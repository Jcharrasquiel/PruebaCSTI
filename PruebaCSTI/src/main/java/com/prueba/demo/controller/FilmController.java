package com.prueba.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.demo.model.Film;
import com.prueba.demo.service.SwapiClient;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private SwapiClient swapiClient;
    @GetMapping("/{id}")
    public ResponseEntity<?> getFilmById(@PathVariable String id) {
        return swapiClient.getFilmById(id);
    }
    @PutMapping("/{id}")
     public ResponseEntity<?> updateFilm(@PathVariable String id,  @RequestBody Film updatedFilm) {
        return swapiClient.updateFilById(id,updatedFilm);
    }
    @DeleteMapping("/{id}")
     public ResponseEntity<?> deleteFilm(@PathVariable String id  ) {
        return swapiClient.deleteFilById(id);
     }
}
