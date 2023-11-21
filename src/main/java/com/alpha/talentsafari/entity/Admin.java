package com.alpha.talentsafari.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@PrimaryKeyJoinColumn(name = "admin_id")
public class Admin extends User{
    private String firstName;
    private String lastName;
    private Gender gender;
}
