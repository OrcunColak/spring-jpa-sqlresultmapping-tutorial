package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Payment;
import com.colak.springtutorial.jpa.PaymentSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    @Query(name = "Payment.findSummary", nativeQuery = true)
    List<PaymentSummary> findSummary();

}
