package com.food.ordercreator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.food.ordercreator.beans.Order;
import com.food.ordercreator.feign.OrderProcessFeign;
import com.food.ordercreator.response.OrderCreateResponse;

@RestController
public class OrderCreatorController {

	@Autowired
	private OrderProcessFeign orderProcessFeign;
	
	@RequestMapping(value="/orders", method = RequestMethod.POST, produces = "application/json" )
	public OrderCreateResponse saveOrder(@RequestBody Order order) {
		
		OrderCreateResponse ordResp = new OrderCreateResponse(orderProcessFeign.saveOrder(order), "Processing");
		return ordResp;
	}
	
}
