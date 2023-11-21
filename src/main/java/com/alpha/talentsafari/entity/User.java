package com.alpha.talentsafari.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
@Inheritance(strategy = InheritanceType.JOINED)
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String user_id;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String picture;
}
