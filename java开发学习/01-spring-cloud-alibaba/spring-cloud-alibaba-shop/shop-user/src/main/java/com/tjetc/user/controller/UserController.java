package com.tjetc.user.controller;

import com.tjetc.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.tjetc.user.service.UserService;
import com.tjetc.user.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public Result<String> hello() {
        return Result.success("用户服务启动成功");
    }
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Long id) {
        User user = userService.getById(id);
        if (user == null) {
            return Result.fail(404,"用户不存在");
        }
        return Result.success(user);
    }
    @PostMapping
    public Result<User> create(@RequestBody User user) {
        return Result.success(userService.create(user));
    }

}
