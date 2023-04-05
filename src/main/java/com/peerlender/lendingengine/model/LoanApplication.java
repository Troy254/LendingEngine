package com.peerlender.lendingengine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Data //Add getters and setters
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="loan_app")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer amount;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User borrower;
    private LocalDate repaymentTerm;
    private Integer interestRate;

}
