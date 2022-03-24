package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {

    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        User user1= User.builder().id(1L).name("user1").build();
        User user2= User.builder().id(2L).name("user2").build();
        users.add(user1);
        users.add(user2);
    }
    @GetMapping
    public @ResponseBody
    List<User> index(){
        return users;
    }
}
