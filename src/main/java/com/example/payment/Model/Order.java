package com.example.payment.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //create bean from the entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double price;
    private String currency;
    private String method;
    private String intent;
    private String description;
    @ManyToOne
    @JoinColumn(name = "pay_id",nullable = false)
    private Payment payment;

}
