package com.xinjingjie.springcloud.service.impl;

import com.xinjingjie.cloudapicommons.entities.Payment;
import com.xinjingjie.springcloud.dao.PaymentDao;
import com.xinjingjie.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int creat(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
