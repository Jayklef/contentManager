package com.jayklef.contentmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer genreId;
    private String name;
}
