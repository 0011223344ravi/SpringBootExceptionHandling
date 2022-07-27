package com.example.springbootexceptionhandling.repo;

import com.example.springbootexceptionhandling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
