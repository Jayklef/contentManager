package com.jayklef.contentmanager.controller;

import com.jayklef.contentmanager.dto.GenreDto;
import com.jayklef.contentmanager.service.GenreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @PostMapping("/new")
    public ResponseEntity<GenreDto> createGenre(@RequestBody GenreDto genreDto){
        GenreDto newGenre = genreService.createGenre(genreDto);
        return new ResponseEntity<>(newGenre, HttpStatus.CREATED);
    }
}
