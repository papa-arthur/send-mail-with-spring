package com.alpha.talentsafari.repository;

import com.alpha.talentsafari.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
