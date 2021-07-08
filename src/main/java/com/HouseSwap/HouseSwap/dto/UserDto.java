package com.HouseSwap.HouseSwap.dto;

import com.HouseSwap.HouseSwap.Model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;




@Getter
@NoArgsConstructor

public class UserDto {


    private String name;


    private String username;


    private String password;

    public User convertToUser()
    {
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }
}
