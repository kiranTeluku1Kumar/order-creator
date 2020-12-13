package com.food.ordercreator.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.food.ordercreator.beans.Order;
import com.food.ordercreator.response.OrderCreateResponse;

@FeignClient(name = "food-order-processing")
public interface OrderProcessFeign {

	@RequestMapping(value="/orders", method = RequestMethod.POST, produces = "application/json" )
	public int saveOrder(Order order);

}
