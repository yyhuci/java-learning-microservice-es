package com.tjetc.order.controller;
import com.tjetc.common.Result;
import com.tjetc.openfeign.user.UserServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tjetc.order.service.OrderService;
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final UserServiceFeign userServiceFeign;
    private final OrderService orderService;

    public OrderController(UserServiceFeign userServiceFeign, OrderService orderService) {
        this.userServiceFeign = userServiceFeign;
        this.orderService = orderService;
    }
    @GetMapping("/user-hello")
    public Result<String> userHello(){
        return userServiceFeign.hello();
    }
    @GetMapping("/message1")
    public Result<String> message1() {
        return Result.success(orderService.message());
    }

    @GetMapping("/message2")
    public Result<String> message2() {
        return Result.success(orderService.message());
    }
}
