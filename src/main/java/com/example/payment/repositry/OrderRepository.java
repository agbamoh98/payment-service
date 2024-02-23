package com.example.payment.repositry;

import com.example.payment.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    public Optional<Order> getAllOrdersByPriceLessThan (double price);
}
