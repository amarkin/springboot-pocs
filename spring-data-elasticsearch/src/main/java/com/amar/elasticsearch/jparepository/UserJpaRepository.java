package com.amar.elasticsearch.jparepository;

import com.amar.elasticsearch.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<Users, Long> {
}
