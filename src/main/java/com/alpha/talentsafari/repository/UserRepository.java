package com.alpha.talentsafari.repository;

import com.alpha.talentsafari.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(String userId);

    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
