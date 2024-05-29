package com.crlsistemas.projwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crlsistemas.projwebservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
