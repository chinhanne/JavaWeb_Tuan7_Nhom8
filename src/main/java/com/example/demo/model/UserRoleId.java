package com.example.demo.model;


import jakarta.persistence.Column;

import java.io.Serializable;

public class UserRoleId implements Serializable {
    @Column(name = "user_id")
    private Integer user;
    @Column(name = "role_id")
    private Integer role;
}
