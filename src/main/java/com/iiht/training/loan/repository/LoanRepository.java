package com.iiht.training.loan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.iiht.training.loan.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

	// write your logic here

	// feel free to update this
	Page<Loan> findByKeyword(@Param("keyword") String keyword, Pageable pageable);

	// feel free to update this
	void updateLoanStatus(@Param("active") boolean active, @Param("id") Long id);

}
