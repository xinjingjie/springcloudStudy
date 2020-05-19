package com.xinjingjie.springcloud.controller;

import com.xinjingjie.cloudapicommons.entities.CommonResult;
import com.xinjingjie.cloudapicommons.entities.Payment;
import com.xinjingjie.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult creat(@RequestBody Payment payment){
        int result=paymentService.creat(payment);
        log.info("插入结果"+result);

        if (result>0){
            return new CommonResult(200,"success"+serverPort,result);
        }else
            return new CommonResult(444,"failure"+serverPort);
    }
    @GetMapping("/find/{id}")
    public CommonResult find(@PathVariable("id") Long id){
        Payment result=paymentService.getPaymentById(id);
        log.info("插入结果"+result);

        if (result!=null){
            return new CommonResult(200,"success"+serverPort,result);
        }else
            return new CommonResult(444,"failure"+serverPort);
    }
}
