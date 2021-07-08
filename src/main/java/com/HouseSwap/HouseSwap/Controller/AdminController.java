package com.HouseSwap.HouseSwap.Controller;


import com.HouseSwap.HouseSwap.Model.User;
import com.HouseSwap.HouseSwap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    private IUserService userService;


    @GetMapping("all")
    public ResponseEntity<?> getAllUsers()
    {
        return ResponseEntity.ok(userService.findAllUsers());
    }


    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId)
    {
        User user = userService.deleteUser(userId);
        return ResponseEntity.ok(user);
    }
}
