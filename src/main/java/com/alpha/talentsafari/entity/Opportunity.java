package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Setter
@Getter
@Entity
public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private int yearsOfExperience;
    private String tags;
    private LocalDateTime deadLine;
    private Qualification qualification;
    private String location;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "opportunity_category_join",
            joinColumns = { @JoinColumn(name = "opportunity_id") },
            inverseJoinColumns = { @JoinColumn(name = "opportunity_cat_id") }
    )
    private Set<OpportunityCategory> categories;
    @ManyToOne
    @JoinColumn(name = "opportunity_id")
    private Organization organization;
}
