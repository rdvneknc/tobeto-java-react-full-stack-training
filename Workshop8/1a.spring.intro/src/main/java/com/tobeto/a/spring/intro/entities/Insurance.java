package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

public class Insurance {

    @Id
    @Column(name = "insurance_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int insurance_id;

    @Column(name = "insurance")
    private Boolean insurance;

    @OneToOne()
    @JoinColumn(name = "insurance")
    private Vehicle insurances;
}
