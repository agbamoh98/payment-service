package com.example.payment.controller;

import com.example.payment.Model.Order;
import com.example.payment.Model.Payment;
import com.example.payment.Service.OrderServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderServices orderServices;

    @PostMapping("/pay")
    public ResponseEntity<String> pay(@RequestBody Order order){
        try {
            Optional<Order> myorder=orderServices.findByID(order.getId());
            Payment mypayment=myorder.get().getPayment();
            mypayment.setTotalAmount(mypayment.getTotalAmount()-order.getPrice());
            return new ResponseEntity<>("payment successful", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("payment error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
