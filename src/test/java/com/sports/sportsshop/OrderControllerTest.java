package com.sports.sportsshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sports.sportsshop.controller.OrderController;
import com.sports.sportsshop.model.Orders;
import com.sports.sportsshop.serviceImpl.OrderServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class OrderControllerTest {
	  
		//private static final String Long = null;

		@InjectMocks
		private OrderController orderController;
		
		@Mock
		private OrderServiceImpl orderServiceImpl;
		
		@Test
	    public void  getAllOrdersTest() {
		List<Orders> order=new ArrayList<Orders>();
			//Give
	    order.add(new Orders(1002,1600.00,"2000-12-05","card"));
	    order.add(new Orders(1003,2600.00,"2000-12-15","card"));
		
		//when
		when(orderServiceImpl.getAllOrders()).thenReturn(order);
		
		//Assert Test
		List<Orders> order2=orderController.getDetails();
		assertEquals(2,order2.size());
		verify(orderServiceImpl, times(1)).getAllOrders();
		
		}
		
		@Test
		public void addOrder() {
			Orders order = new Orders(10001, 1000.00,"2000-12-55","card");
			ResponseEntity<?> response = new ResponseEntity<>(order, HttpStatus.CREATED);
			when(orderServiceImpl.addOrder(order)).thenReturn(order);
			assertEquals(response, orderController.add(order));
		}

		@Test
		public void updateCustomer() {
			Orders order = new Orders(10001, 1000.00,"2000-12-55","card");
			ResponseEntity<?> res = new ResponseEntity<>(order, HttpStatus.CREATED);
			when(orderServiceImpl.updateOrder(order)).thenReturn(order);
			assertEquals(res, orderController.update(order));
		}
		
		@Test
		public void deleteUserTest() {
			long orderId = 100;
			ResponseEntity<?> response = new ResponseEntity<>("Order with ID: 100 deleted successfully",HttpStatus.OK);
			Orders orders = new Orders(10001, 1000.00,"2000-12-55","card");
			when(orderServiceImpl.removeOrder(orderId)).thenReturn(orders);
			assertEquals(response, orderController.delete(orderId));
		}
		

	    
}



