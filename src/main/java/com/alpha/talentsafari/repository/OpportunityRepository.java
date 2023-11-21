package com.alpha.talentsafari.repository;

import com.alpha.talentsafari.entity.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
}
