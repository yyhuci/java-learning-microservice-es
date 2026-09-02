package com.tjetc.order.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.tjetc.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    @SentinelResource(value = "orderServiceMessage")
    public String message(){
        return "来自orderservice 的公共消息";
    }
}
