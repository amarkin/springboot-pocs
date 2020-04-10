package com.amar.springjpahibernate.repository;

import com.amar.springjpahibernate.model.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}
