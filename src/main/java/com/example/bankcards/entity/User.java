package com.example.bankcards.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * Класс представляет модель пользователей банка
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Card> card;

    @Enumerated(EnumType.STRING)
    private Role role;


}
