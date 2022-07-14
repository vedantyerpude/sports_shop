package com.sports.sportsshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sports.sportsshop.model.Order;
import com.sports.sportsshop.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/orders")
	public String add(Order order) {
		orderService.addOrder(order);
		return "Order added";
	}
	
	@GetMapping("/orders")
	public List<Order> getDetails(){
		return orderService.getAllOrders();
	}
	
	@PostMapping("/orders")
	public String update(long orderId,Order order) {
		orderService.updateOrder(orderId, order);
		return "Order Updated";
		
	}
	
	@DeleteMapping("/seats")
	public String delete(long orderId) {
		orderService.removeOrder(orderId);
		return "Order Deleted";
	}
	
	

}
