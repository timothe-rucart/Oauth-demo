package com.example.oauthserver.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chien")
public class Chien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
