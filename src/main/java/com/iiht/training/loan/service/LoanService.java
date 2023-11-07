package com.iiht.training.loan.service;

import java.util.List;
import com.iiht.training.loan.entity.Loan;

public interface LoanService {
    List<Loan> getAllLoan();
    Loan saveLoan(Loan loan);
    Loan getLoanById(Long id);
    Loan updateLoan(Loan loan);
    boolean deleteLoanById(Long id);
    public List<Loan> getByKeyword(String keyword);
}
