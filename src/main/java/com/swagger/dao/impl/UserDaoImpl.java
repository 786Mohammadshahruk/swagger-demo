package com.swagger.dao.impl;


import com.swagger.dao.UserDao;
import com.swagger.entity.User;
import com.swagger.utils.UserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getUserDetails() {
        return UserUtils.getAllTheUser();
    }

    @Override
    public User getUserDetailsBasedOnId(long userId) {
        List<User> userList = UserUtils.getAllTheUser();
        for (User user : userList) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> createUser(final User user) {
        System.out.println("Inside DAO ");
        return UserUtils.addUser(user);
    }

    @Override
    public User getUserDetailsBasedOnName(String name) {
        List<User> userList = UserUtils.getAllTheUser();
        for (User user : userList) {
            if (name.equals(user.getFirstName())) {
                return user;
            }
        }
        return null;
    }
}
