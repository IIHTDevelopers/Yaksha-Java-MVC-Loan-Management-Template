package com.iiht.training.loan.entity;

public class Loan {
	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private Double amount;

	private Long interest;

	private String term;

	private boolean active = true;

	public Loan() {

	}

	public Loan(String firstName, String lastName, String email, double amount, Long interest, String term) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.amount = amount;
		this.interest = interest;
		this.term = term;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getInterest() {
		return interest;
	}

	public void setInterest(Long interest) {
		this.interest = interest;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
