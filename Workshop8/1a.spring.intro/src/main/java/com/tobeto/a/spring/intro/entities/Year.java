package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

public class Year {

    @Id
    @Column(name = "year_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year_id;

    @Column(name = "year")
    private int year;

    @OneToOne()
    @JoinColumn(name = "year")
    private Vehicle years;
}
