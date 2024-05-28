package com.crlsistemas.projwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crlsistemas.projwebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
