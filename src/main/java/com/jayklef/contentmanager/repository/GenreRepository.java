package com.jayklef.contentmanager.repository;

import com.jayklef.contentmanager.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
