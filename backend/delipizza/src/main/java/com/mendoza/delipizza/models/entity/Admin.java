package com.mendoza.delipizza.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "ADMIN")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

}
