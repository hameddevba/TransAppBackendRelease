package com.bank.project.dao;

import com.bank.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {
    Optional<User> findByUscode(String username);

    boolean existsByUscode(String username);

//    boolean existsByEmail(String email);
}
