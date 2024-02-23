package com.example.payment.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder //create bean from the entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pay_id;

    private double totalAmount ;
    private String method;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "payment")
    private List<Order> orderList;

}
