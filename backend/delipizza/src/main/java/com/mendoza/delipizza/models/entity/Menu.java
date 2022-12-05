package com.mendoza.delipizza.models.entity;

import com.mendoza.delipizza.utils.Type;
import lombok.Data;


import javax.persistence.*;

@Entity(name = "menu")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String photo;

    private Double price;

    @Enumerated(EnumType.STRING)
    private Type type;

}
