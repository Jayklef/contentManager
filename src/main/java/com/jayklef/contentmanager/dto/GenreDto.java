package com.jayklef.contentmanager.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class GenreDto {

    private Integer genreId;

    @NotEmpty(message = "please enter the name of the genre")
    private String name;
}
