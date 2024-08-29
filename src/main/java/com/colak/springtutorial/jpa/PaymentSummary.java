package com.colak.springtutorial.jpa;

import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@SqlResultSetMapping(
        name = "PaymentSummaryMapping",
        classes = @ConstructorResult(
                targetClass = PaymentSummary.class,
                columns = {
                        @ColumnResult(name = "totalAmount", type = BigDecimal.class)
                }
        )
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentSummary {
    private BigDecimal totalAmount;
}
