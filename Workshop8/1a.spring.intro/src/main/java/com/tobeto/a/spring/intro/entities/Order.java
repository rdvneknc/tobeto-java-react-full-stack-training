package com.tobeto.a.spring.intro.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "orders")
@Entity
public class Order
{
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @Column(name = "customer_id")
    private int customer_id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "duration_by_day")
    private int duration_by_day;

    @Column(name = "total_cost")
    private BigDecimal total_cost;

    @Column(name = "starting_location")
    private String starting_location;

    @Column(name = "ending_location")
    private String ending_location;


    @OneToMany(mappedBy = "vehicle")
    private List<Vehicle> vehicles;

    @OneToMany(mappedBy = "customer")
    private List<Customer> customers;

    @OneToMany(mappedBy = "card")
    private List<Card> cards;


}
