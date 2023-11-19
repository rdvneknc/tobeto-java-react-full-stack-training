package com.tobeto.a.spring.intro.entities;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;

// ORM - Object Relation Mapping



@Table(name = "vehicles")
@Entity
public class Vehicle
{

    @Id
    @Column(name = "license_plate")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String license_plate;

    @Column(name = "model")
    private String model;

    @Column(name = "year")  // column adı
    private int year;      // classın içindeki alanın adı

    @Column(name = "insurance")
    private boolean insurance;

    @Column(name = "price_by_day")
    private BigDecimal price_by_day;   //!!!!!!!!!!!!!!!!

    @Column(name = "capacity")
    private int capacity;

    @ManyToOne()
    @JoinColumn(name = "license_plate")
    private Order vehicle_id;

    @OneToMany(mappedBy = "model")
    private List<Model> models;

    @OneToMany(mappedBy = "year")
    private List<Year> years;

    @OneToMany(mappedBy = "insurance")
    private List<Insurance> insurances;


}
