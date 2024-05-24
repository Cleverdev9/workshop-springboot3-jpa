package com.crlsistemas.projwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crlsistemas.projwebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
