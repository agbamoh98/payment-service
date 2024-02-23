package com.example.payment.repositry;

import com.example.payment.Model.Order;
import com.example.payment.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {




}
