package com.example.payment.Service;

import com.example.payment.Model.Order;
import com.example.payment.repositry.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServices {
    @Autowired
    OrderRepository orderRepository;
    public Optional<Order> findByID(int id )
    {
        return orderRepository.findById(id);
    }

    public Order save ( Order book)
    {
        return orderRepository.save(book);
    }

    public void deleteBook( int id)
    {
        orderRepository.deleteById(id);
    }

    public Optional<Order> getAllOrdersByPriceLessThan (double price){
        return orderRepository.getAllOrdersByPriceLessThan(price);
    }
    public Order updateBook(Order book)
    {
        return orderRepository.save(book);
    }

    public void deleteAll()
    {
        orderRepository.deleteAll();
    }
}
