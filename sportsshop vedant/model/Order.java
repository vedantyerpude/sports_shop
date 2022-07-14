package com.sports.sportsshop.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id
	@Column
	private long orderId;
	
	@Column 
	private double amount;
	
	@Column
	private LocalDate billDate;
	
	@Column 
	private Costumer customer;
	
	@Column
	private String paymentMethod;
	
	public Order() {
		
	}

	public Order(long orderId, double amount, LocalDate billDate, Costumer customer, String paymentMethod) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.billDate = billDate;
		this.customer = customer;
		this.paymentMethod = paymentMethod;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public Costumer getCustomer() {
		return customer;
	}

	public void setCustomer(Costumer customer) {
		this.customer = customer;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
