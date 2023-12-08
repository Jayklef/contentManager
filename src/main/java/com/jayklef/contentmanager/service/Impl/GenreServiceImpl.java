package com.jayklef.contentmanager.service.Impl;

import com.jayklef.contentmanager.dto.GenreDto;
import com.jayklef.contentmanager.model.Genre;
import com.jayklef.contentmanager.repository.GenreRepository;
import com.jayklef.contentmanager.service.GenreService;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    private GenreRepository genreRepository;

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public GenreDto createGenre(GenreDto genreDto) {
        return null;
    }
}
