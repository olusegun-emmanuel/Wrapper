package com.wrapper.service;

import com.wrapper.beans.CustomerAddrList;
import com.wrapper.beans.CustomerInfoList;
import com.wrapper.beans.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WrapperServiceService {

@Autowired
    private RestTemplate restTemplate;
    ResponseTemplate responseTemplate = new ResponseTemplate();
    public ResponseTemplate getCustomerDetails() {
    	CustomerInfoList customerInfoList = restTemplate.getForObject("http://customer-info/info/customer", CustomerInfoList.class);
    	CustomerAddrList customerAddrList =  restTemplate.getForObject("http://customer-address/custaddr/address", CustomerAddrList.class);
    	responseTemplate.setCustomerinfo(customerInfoList);
    	responseTemplate.setCustomeraddr(customerAddrList);
        return responseTemplate;
    }
   
}
