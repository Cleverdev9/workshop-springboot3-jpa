package com.crlsistemas.projwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crlsistemas.projwebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
