package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class AwardAndCertification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String year;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String url;
    @ManyToOne()
    @JoinColumn(name = "talent_id")
    private Talent talent;
}
