package com.HouseSwap.HouseSwap.service;

import com.HouseSwap.HouseSwap.Model.Role;
import com.HouseSwap.HouseSwap.Model.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);

    User changeRole(Role newRole, String username);

    User findByUsername(String username);

    User deleteUser(Long userId);

    List<User> findAllUsers();
}
