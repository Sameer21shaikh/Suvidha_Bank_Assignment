package com.suvidhabank.dto;

public class Loandto {
	private String type;
	private double amount;
	private double period;
	private String identity;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		this.period = period;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "Loandto [type=" + type + ", amount=" + amount + ", period=" + period + ", identity=" + identity + "]";
	}

	public Loandto(String type, double amount, double period, String identity) {
		super();
		this.type = type;
		this.amount = amount;
		this.period = period;
		this.identity = identity;
	}

	public Loandto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
