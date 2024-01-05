package com.keniaReis.usersdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keniaReis.usersdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
