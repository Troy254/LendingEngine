package com.peerlender.lendingengine.repository;
import com.peerlender.lendingengine.model.LoanApplication;
import com.peerlender.lendingengine.model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanApplication,Long> {

}
