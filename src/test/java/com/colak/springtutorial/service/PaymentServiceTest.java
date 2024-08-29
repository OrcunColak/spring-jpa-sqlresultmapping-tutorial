package com.colak.springtutorial.service;

import com.colak.springtutorial.jpa.PaymentSummary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    void findSummary() {

        List<PaymentSummary> summary = paymentService.findSummary();
        PaymentSummary paymentSummary = new PaymentSummary(new BigDecimal("801.50"));
        assertThat(summary).containsExactly(paymentSummary);
    }
}