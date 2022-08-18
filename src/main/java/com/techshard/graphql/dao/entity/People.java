package com.techshard.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Entity
public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "height", nullable = false)
    private String height;

    @Column(name = "mass")
    private String mass;

    @Column(name = "gender")
    private String gender;

    @Column(name = "home_world")
    private String homeWorld;
}
