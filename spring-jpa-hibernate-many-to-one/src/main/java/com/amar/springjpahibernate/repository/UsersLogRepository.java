package com.amar.springjpahibernate.repository;

import com.amar.springjpahibernate.model.UsersLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersLogRepository extends JpaRepository<UsersLog, Integer> {
}
