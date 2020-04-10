package com.amar.springbootbatch.repository;

import com.amar.springbootbatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
