package com.iiht.training.loan.controller;

import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.iiht.training.loan.entity.Loan;

public class LoanController {

	@RequestMapping(path = { "/", "/search" })
	public String home(Loan loan, Model model, String keyword) {
		return "";
	}

	@GetMapping("/loan")
	public String listLoan(Model model) {
		return "";
	}

	@GetMapping("/loan/new")
	public String createLoanForm(Model model) {
		return "";

	}

	@PostMapping("/loan")
	public String saveLoan(@Valid @ModelAttribute("loan") Loan loan) {
		return "";
	}

	@GetMapping("/loan/edit/{id}")
	public String editLoanForm(@PathVariable Long id, Model model) {
		return "";
	}

	@PostMapping("/loan/{id}")
	public String updateLoan(@PathVariable Long id, @Valid @ModelAttribute("loan") Loan loan, Model model) {
		return "";
	}

	@GetMapping("/loan/{id}")
	public String deleteLoan(@PathVariable Long id) {
		return "";
	}
}
