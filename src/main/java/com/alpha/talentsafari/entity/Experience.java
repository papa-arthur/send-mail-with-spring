package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String organisation;
    @Column(columnDefinition = "TEXT")
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne()
    @JoinColumn(name = "talent_id")
    private Talent talent;
    @Column
    private boolean isCurrentlyWorkingHere;

}
