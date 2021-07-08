package com.HouseSwap.HouseSwap.Controller;


import com.HouseSwap.HouseSwap.Model.Role;
import com.HouseSwap.HouseSwap.Model.User;
import com.HouseSwap.HouseSwap.dto.UserDto;
import com.HouseSwap.HouseSwap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


import java.security.Principal;

@RestController

@RequestMapping("api/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseEntity<?> register(@RequestBody  UserDto user)
    {
        if (userService.findByUsername(user.getUsername()) != null)
        {
            return new ResponseEntity<>(HttpStatus.CONFLICT);//409
        }

        userService.saveUser(user.convertToUser());
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("login")
    public ResponseEntity<?> login(HttpServletRequest request)
    {


        Principal principal = request.getUserPrincipal();

        if (principal == null || principal.getName() == null)
        {

            return new ResponseEntity<>(HttpStatus.OK);
        }
        User user = userService.findByUsername(principal.getName());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @PutMapping("{username}/change/{role}")
    public ResponseEntity<?> changeRole(@PathVariable String username, @PathVariable Role role)
    {
        User user = userService.changeRole(role, username);
        return ResponseEntity.ok(user);
    }




    }
