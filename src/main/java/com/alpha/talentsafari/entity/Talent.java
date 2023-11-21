package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@PrimaryKeyJoinColumn(name = "talent_id")
public class Talent extends User{
    private String firstName;
    private String lastName;
    private Gender gender;
    private String bio;
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
    private String skills;
    @OneToMany(mappedBy = "talent" )
    private Set<Experience> experiences;
    @OneToMany(mappedBy = "talent" )
    private Set<Education> educations;
    @OneToMany(mappedBy = "talent" )
    private Set<AwardAndCertification> awardsAndCertificates;
    @OneToMany(mappedBy = "talent" )
    private List<Application> applications;

}
