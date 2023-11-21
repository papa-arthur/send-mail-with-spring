package com.alpha.talentsafari.repository;

import com.alpha.talentsafari.entity.Talent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalentRepository extends JpaRepository<Talent, Long> {
}
