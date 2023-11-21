package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.util.Set;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "organization_id")
public class Organization extends User{
    private String name;
    private String description;
    private String website;
    private String location;
    private int teamSize;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "organization_category_join",
            joinColumns = { @JoinColumn(name = "organization_id") },
            inverseJoinColumns = { @JoinColumn(name = "organization_cat_id") }
    )
    private Set<OrganizationCategory> categories;
    @OneToMany(mappedBy = "organization")
    private Set<Opportunity> opportunities;
    @OneToMany(mappedBy = "organization")
    private Set<Application> applications;

}
