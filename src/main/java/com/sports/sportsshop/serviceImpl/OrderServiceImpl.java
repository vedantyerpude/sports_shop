package com.sports.sportsshop.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.sportsshop.exceptions.OrderNotFoundException;
import com.sports.sportsshop.model.Orders;
import com.sports.sportsshop.repo.OrderRepo;
import com.sports.sportsshop.service.OrderService;

@Service //These class files are used to write business logic in a different layer, separated from @RestController class file.
public class OrderServiceImpl implements OrderService {
	
	private static final Logger log =LoggerFactory.getLogger(OrderService.class);
	
	//@Autowired annotation is used for dependency injection.In spring boot application, all loaded beans are eligible for auto wiring to another bean
	@Autowired
	OrderRepo orderRepo;
	

	@Override
	public Orders addOrder(Orders order) {
		log.info("Inside addOrder Service");
		orderRepo.save(order);
		return order;
	}

	@Override
	public Orders removeOrder(long orderId) {
		log.info("Inside removeOrder Service");
		Orders o=orderRepo.findByOrderId(orderId);
		if(o==null) {
			throw new OrderNotFoundException("Order with Id "+orderId+" does not exist.");
		}
		orderRepo.delete(o);
		return o;
	}

	@Override
	public Orders updateOrder(Orders order) {
		log.info("Inside updateOrder Service");
		//Orders o2=orderRepo.findById(orderId).get();
		orderRepo.save(order);
		return order;
	}

	@Override
	public Orders getOrderDetails(long orderId) {
		log.info("Inside getOrderDetails Service");
		Orders o1=orderRepo.findByOrderId(orderId);
		if(o1==null) {
			throw new OrderNotFoundException("Order with Id "+orderId+" does not exist.");
		}
		return o1;
	}

	@Override
	public List<Orders> getAllOrders() {
		//Log.info("Inside get detail");
		return orderRepo.findAll();
	}

}
