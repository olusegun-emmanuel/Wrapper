package com.wrapper.controller;

import com.wrapper.beans.Customerinfo;
import com.wrapper.beans.ResponseTemplate;
import com.wrapper.service.WrapperServiceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerwrappers")
@Api(value="/customerwrapper" , tags="CustomerWrapperController")
public class WrapperServiceController {
    @Autowired
    private WrapperServiceService wrapperServiceService;

  //This method gets the customer info from CustomerInfo microservice
  	@GetMapping("/customerinfos")
  	@ApiOperation(value = "Gets customers info from the back end ", response = Customerinfo.class, tags = "getCustomerDetails")
  	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success"),})
    public ResponseTemplate getCustomerDetails (){
        return wrapperServiceService.getCustomerDetails();
    }

}
