package com.example.bankcards.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * Класс представляет модель карты
 */
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String numberCard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime validityPeriod;

    @Enumerated(EnumType.STRING)
    private Status status;

    private int balanceCard;


}
