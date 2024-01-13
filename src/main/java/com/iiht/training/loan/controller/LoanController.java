package com.iiht.training.loan.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iiht.training.loan.entity.Loan;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/loan", "/" })
public class LoanController {

	@RequestMapping(value = { "/list", "/", "/search" })
	public String home(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForAdd")
	public String createLoanForm(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveLoan")
	public String saveLoan(@Valid @ModelAttribute("loan") Loan loan, BindingResult bindingResult, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("loanId") Long loanId, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("loanId") Long loanId, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("active") boolean active, @RequestParam("id") Long id, Model theModel) {
		// write your logic here
		return "";
	}
}
