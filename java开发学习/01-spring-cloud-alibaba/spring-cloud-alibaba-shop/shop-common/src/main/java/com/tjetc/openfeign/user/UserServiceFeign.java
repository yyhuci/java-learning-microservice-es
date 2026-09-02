package com.tjetc.openfeign.user;

import com.tjetc.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "shop-user" )
public interface UserServiceFeign {
    @GetMapping("/users/hello")
    Result<String> hello();
}

