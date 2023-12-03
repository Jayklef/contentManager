package com.jayklef.contentmanager.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

public record Content(
        Integer id,

        @NotEmpty
        String title,
        @NotEmpty
        String description,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
