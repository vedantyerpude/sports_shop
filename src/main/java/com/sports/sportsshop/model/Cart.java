package com.sports.sportsshop.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Cart {
	
	@Id
	@Column
	private String imageName;
	
	@Column
	@NotBlank(message="Please specify the quantity")
	private int quantity;
	
	@Column
	private double price;
	
	@Column
	private double total;
	
	@OneToMany
	private List<Product> product;
	
	public Cart() {
		
	}
    
	public Cart(String imageName, @NotBlank(message = "Please specify the quantity") int quantity, double price,
			double total, List<Product> product) {
		super();
		this.imageName = imageName;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
		this.product = product;
	}


    public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

    






	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}


	
	
	

}