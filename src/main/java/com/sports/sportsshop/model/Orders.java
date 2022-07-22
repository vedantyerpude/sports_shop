package com.sports.sportsshop.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Orders {
	
	@Id//@Id annotation specifies the primary key of an entity
	//The @GeneratedValue annotation is to configure the way of increment of the specified column(field).
	//For example when using Mysql , you may specify auto_increment in the definition of table to make it self-incremental, and then use @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long orderId;
	
	@Column 
	private double amount;
	
	@Column
	private LocalDate billDate;
	
	
//	@Column
//	@NotBlank(message="PaymentMethod is required")
	@Column
	private String paymentMethod;
	
	@OneToOne
	private Payment payment;
	
	@OneToOne
	private Cart cart;

    @ManyToOne
    @JsonIgnore
	private Customer customer;
	
	
	public Orders() {
		
	}


	
	public Orders(long l, double string, String string2, String string3) {
		// TODO Auto-generated constructor stub
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


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	
	                                                                    
}
