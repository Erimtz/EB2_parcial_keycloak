package com.example.msusers.controller;

import com.example.msusers.client.FeignBillRepository;
import com.example.msusers.domain.User;
import com.example.msusers.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v2/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/find/{id}")
    public User findById(@PathVariable String id){

        return userService.findById(id);
    }
}
