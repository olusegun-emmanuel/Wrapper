package com.wrapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.wrapper.beans.CustomerAddrList;
import com.wrapper.beans.CustomerInfoList;

@RestController
@RequestMapping("/customerwrapper")
public class CustomerWrapperController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/customerinfo")
	//This method gets the customer info from CustomerInfo microservice
	public CustomerInfoList getCustomerInfo()	{
		CustomerInfoList customerInfoList = restTemplate.getForObject("http://localhost:8082/customer-info/info/customer", CustomerInfoList.class);
		return customerInfoList;
	}

	@RequestMapping("/customeraddr")
	//This method gets the customer address from CustomerAddress microservice
	public CustomerAddrList getCustomerAddrlist()	{
		CustomerAddrList customerAddrList =  restTemplate.getForObject("http://localhost:8082/customer-address/custaddr/address", CustomerAddrList.class);
		return customerAddrList;
	}
	
}
