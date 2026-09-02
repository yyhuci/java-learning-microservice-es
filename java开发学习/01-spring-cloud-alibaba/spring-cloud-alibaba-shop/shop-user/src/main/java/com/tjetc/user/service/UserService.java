package com.tjetc.user.service;
import com.tjetc.user.entity.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
@Service
public class UserService {

    private final Map<Long, User> users = new HashMap<>();
    public User getById(Long id) {
        return users.get(id);
    }
    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }
}
