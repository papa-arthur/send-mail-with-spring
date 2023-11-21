package com.alpha.talentsafari.repository;

import com.alpha.talentsafari.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
