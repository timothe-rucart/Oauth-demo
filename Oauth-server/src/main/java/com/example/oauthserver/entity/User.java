package com.example.oauthserver.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstname;
    private String lastName;
    private String email;
    @Column(length = 60)
    private String password;
    private String role;
    private boolean enabled = false;
}
