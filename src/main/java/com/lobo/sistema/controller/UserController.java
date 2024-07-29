package com.lobo.sistema.controller;

import com.lobo.sistema.dto.UserDTO;
import com.lobo.sistema.model.User;
import com.lobo.sistema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
       User response = userService.save(userDTO);

       if(response != null)
           return new ResponseEntity<>(HttpStatus.CREATED);

       return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getUsers")
    public @ResponseBody List<UserDTO> getUsers() {
        List<UserDTO> users = userService.getAllUsers();

        if(users != null)
            return users;

        return new ArrayList<>();
    }
}
