package com.amar.jpa.springjpahibernate.repository;

import com.amar.jpa.springjpahibernate.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);

}
