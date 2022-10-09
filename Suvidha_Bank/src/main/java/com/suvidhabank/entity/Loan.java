package com.suvidhabank.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Loan {
	@Id
	private String loanId;
	private String loanType;
	private double loanAmount;
	private double interestRate;
	private double period;
	private boolean isApproved;
	private String remarks;
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_Id")

	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_Id")
	private Employee employee;

	@Embedded
	private List<Collateral> collaterals;

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		this.period = period;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Collateral> getCollaterals() {
		return collaterals;
	}

	public void setCollaterals(List<Collateral> collaterals) {
		this.collaterals = collaterals;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", interestRate="
				+ interestRate + ", period=" + period + ", isApproved=" + isApproved + ", remarks=" + remarks
				+ ", customer=" + customer + ", employee=" + employee + ", collaterals=" + collaterals + "]";
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(String loanId, String loanType, double loanAmount, double interestRate, double period,
			boolean isApproved, String remarks, Customer customer, Employee employee, List<Collateral> collaterals) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.period = period;
		this.isApproved = isApproved;
		this.remarks = remarks;
		this.customer = customer;
		this.employee = employee;
		this.collaterals = collaterals;
	}

	public static double calculateInterest(double period) {
		// TODO Auto-generated method stub
		if (period <= 2)
			return 0.05;
		else if (period > 2 && period < 5)
			return 0.06;
		else if (period >= 5 && period < 8)
			return 0.08;
		else
			return 0.085;
	}

}
