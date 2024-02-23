package com.example.payment.Service;

import com.example.payment.Model.Order;
import com.example.payment.Model.Payment;
import com.example.payment.repositry.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServices {
    @Autowired
    PaymentRepository paymentRepository;
    public Optional<Payment> findByID(int id )
    {
        return paymentRepository.findById(id);
    }

    public Payment save ( Payment book)
    {
        return paymentRepository.save(book);
    }

    public void deletePayment( Payment payment)
    {
        paymentRepository.deleteById(payment.getPay_id());
    }


    public Payment updateBook(Payment book)
    {
        return paymentRepository.save(book);
    }

    public void deleteAll()
    {
        paymentRepository.deleteAll();
    }



}
