package com.colak.springtutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity

@Table(name = "payments")
@NamedNativeQuery(name = "Payment.findSummary",
        query = "SELECT SUM(p.amount) AS totalAmount FROM payments p",
        resultSetMapping = "PaymentSummaryMapping")
@SqlResultSetMapping(name = "PaymentSummaryMapping",
        classes = @ConstructorResult(targetClass = PaymentSummary.class,
                columns = {@ColumnResult(name = "totalAmount", type = BigDecimal.class)}))

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;
}
