package com.crlsistemas.projwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crlsistemas.projwebservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
