package com.HouseSwap.HouseSwap.service;

import com.HouseSwap.HouseSwap.Model.Role;
import com.HouseSwap.HouseSwap.Model.User;
import com.HouseSwap.HouseSwap.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreateDate(LocalDateTime.now());
        user.setRole(Role.ROLE_USER);
        return userRepository.save(user);
    }

    @Override
    public User changeRole(Role newRole, String username)
    {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException());
        user.setRole(newRole);
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username)
    {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public User deleteUser(Long userId)
    {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException());
        userRepository.delete(user);
        return user;
    }

    @Override
    public List<User> findAllUsers()
    {
        return userRepository.findAll();
    }
}
