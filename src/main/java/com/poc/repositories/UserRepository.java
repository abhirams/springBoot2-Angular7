package com.poc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.poc.entities.User;

@Repository
//@CrossOrigin(origins = "http://localhost:4200")
public interface UserRepository extends CrudRepository<User, Long> {
	
}