package com.tjetc.user.service;

import com.tjetc.user.entity.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserServiceTest {
    @Test
    void shouldGetUserById(){

        UserService userService = new UserService();
        userService.create(new User(1001L, "张三", "13800000000"));
        User user = userService.getById(1001L);
        assertEquals(1001L, user.getId());
        assertEquals("张三",user.getUsername());
        assertEquals("13800000000",user.getPhone());
    }
    @Test
    void shouldCreateUser() {
        UserService userService = new UserService();

        User user = new User(1002L, "李四", "13900000000");
        User createdUser = userService.create(user);

        assertEquals(1002L, createdUser.getId());
        assertEquals("李四", createdUser.getUsername());
        assertEquals("13900000000", createdUser.getPhone());
    }
}
