package com.example.msauth.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msauth.entity.AuthUser;

import java.util.Optional;


public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {
    Optional<AuthUser> findByUserName(String username);
}
