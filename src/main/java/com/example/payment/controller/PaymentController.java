package com.example.payment.controller;

import com.example.payment.Model.Payment;
import com.example.payment.Service.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentServices paymentServices;

    @PostMapping("/cancel")
    public ResponseEntity<HttpStatus> cancelPay(@RequestBody Payment payment) {
        try {
            paymentServices.deletePayment(payment);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/successPay/{payid}/{ordid}")
    public ResponseEntity<HttpStatus> successPay (@PathVariable("payid") int paymentId, @PathVariable("ordid") int payerId){
        try {
            Optional<Payment> mypayment=paymentServices.findByID(paymentId);


            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
