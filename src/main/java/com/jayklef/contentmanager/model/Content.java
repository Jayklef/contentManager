package com.jayklef.contentmanager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.executable.ValidateOnExecution;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "contents")
public class Content{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String title;
        private String description;
        private Status status;
        private Type contentType;
        private String url;
        private LocalDateTime dateCreated;
        private LocalDateTime dateUpdated;
}
