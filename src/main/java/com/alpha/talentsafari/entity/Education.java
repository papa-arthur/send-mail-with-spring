package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String institution;
    @Column(columnDefinition = "TEXT")
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isCurrentInstitution;
    @ManyToOne
    @JoinColumn(name = "talent_id")
    private Talent talent;
}
