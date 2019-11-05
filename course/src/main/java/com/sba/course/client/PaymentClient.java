package com.sba.course.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import com.sba.course.model.Payment;


@FeignClient(name = "sba-payment")
public interface PaymentClient {
	
	@PostMapping(value = "/payment/api/v1/add")
	ResponseEntity<Object> addPayment( @RequestBody Payment payment);


}
