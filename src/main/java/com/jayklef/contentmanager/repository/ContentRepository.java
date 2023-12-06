package com.jayklef.contentmanager.repository;

import com.jayklef.contentmanager.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Integer> {
}
