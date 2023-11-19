package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class Transaction {

    @Id
    @Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "license_plate")
    private String license_plate;

    @Column(name = "card_id")
    private String card_id;

    @Column(name = "customer_id")
    private String customer_id;

    @OneToOne(mappedBy = "card")
    private List<Card> cards;

    @OneToOne(mappedBy = "order")
    private List<Order> orders;

    @OneToOne(mappedBy = "vehicle")
    private List<Vehicle> vehicles;

    @OneToOne(mappedBy = "customer")
    private List<Customer> customers;
}
