package com.jayklef.contentmanager.dto;

import com.jayklef.contentmanager.model.Status;
import com.jayklef.contentmanager.model.Type;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContentDto {
    private Integer id;

    @NotEmpty(message = "Please enter a title")
    private String title;

    @NotEmpty(message = "Please enter the book description")
    private String description;

    private Status status;
    private Type contentType;

    @NotEmpty(message = "Please enter the book url")
    private String url;

    @Past
    @NotEmpty(message = "please enter the date the book was created")
    private LocalDateTime dateCreated;

    private LocalDateTime dateUpdated;
}
