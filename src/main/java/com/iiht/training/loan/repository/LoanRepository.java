package com.iiht.training.loan.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.iiht.training.loan.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan,Long> {
	// add your custom query here
    List<Loan> findByKeyword(@Param("keyword") String keyword);
}
