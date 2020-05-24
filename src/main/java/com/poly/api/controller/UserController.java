package com.poly.api.controller;


import com.poly.api.dto.UserDto;
import com.poly.api.entities.User;
import com.poly.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/findAll",produces = "application/json")
    public List<UserDto> getAll(){
        return userService.findAll();
    }
}
