package com.pluralsight.conference.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CONF_USERS")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstname;
    @Column(name = "LAST_NAME")
    private String lastname;
    private int age;
}
