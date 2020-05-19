package com.xinjingjie.springcloud.service;


import com.xinjingjie.cloudapicommons.entities.Payment;

public interface PaymentService {
    public int creat(Payment payment);
    public Payment getPaymentById(Long id);

}
