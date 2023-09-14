package com.swagger.dao;

import com.swagger.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getUserDetails();

    User getUserDetailsBasedOnId(long userId);

    List<User> createUser(User user);

    User getUserDetailsBasedOnName(String name);
}
