package com.tobeto.a.spring.intro.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "cards")
@Entity
public class Card {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int card_id;

    @Column(name = "card_exp_date")
    private LocalDateTime card_exp_date;

    @Column(name = "cvv")
    private int cvv;

    @Column(name = "customer_id")
    private int customer_id;

    @ManyToOne()
    @JoinColumn(name = "card_id")
    private Customer cardId;

}
