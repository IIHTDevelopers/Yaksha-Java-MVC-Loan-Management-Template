package com.iiht.training.loan.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.iiht.training.loan.entity.Loan;
import com.iiht.training.loan.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {
	@Override
	public Page<Loan> getAllLoan(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public Loan saveLoan(Loan loan) {
		// write your logic here
		return null;
	}

	@Override
	public Loan getLoanById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public Loan updateLoan(Loan loan) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteLoanById(Long id) {
		// write your logic here
		return false;
	}

	@Override
	public Page<Loan> getByKeyword(String keyword, Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public boolean updateLoanStatus(boolean active, Long id) {
		// write your logic here
		return false;
	}
}
