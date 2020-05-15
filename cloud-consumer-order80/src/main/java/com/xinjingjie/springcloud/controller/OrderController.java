package com.xinjingjie.springcloud.controller;

import com.xinjingjie.springcloud.entities.CommonResult;
import com.xinjingjie.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    private String PAYMENT_URL="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return  restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        return  restTemplate.getForObject(PAYMENT_URL+"/payment/find/"+id,CommonResult.class);
    }
}
