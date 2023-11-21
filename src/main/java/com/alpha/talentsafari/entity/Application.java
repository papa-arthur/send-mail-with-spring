package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
    @ManyToOne
    @JoinColumn(name = "talent_id")
    private Talent talent;
    @ManyToOne
    @JoinColumn(name = "opportunity_id")
    private Opportunity opportunity;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;
    @CreationTimestamp
    private LocalDate submittedAt;
    @UpdateTimestamp
    private LocalDate updatedAt;

}
