package com.mendoza.delipizza.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mendoza.delipizza.utils.Rol;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;


@Entity(name = "user")
@Data
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class User extends Admin {

    private String firstName;

    private String lastName;

    private Long phone;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private boolean deleted = Boolean.FALSE;

    private List<Order> order;
}
