package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Model {
    @Id
    @Column(name = "model_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int model_id;

    @Column(name = "model")
    private String model;

    @OneToOne()
    @JoinColumn(name = "license_plate")
    private Vehicle license_plate;
}
