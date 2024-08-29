package com.colak.springtutorial.service;

import com.colak.springtutorial.jpa.PaymentSummary;
import com.colak.springtutorial.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public List<PaymentSummary> findSummary() {
        return repository.findSummary();
    }
}
