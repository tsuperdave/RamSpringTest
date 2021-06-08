package com.ramspringtest.application.controller;

import com.ramspringtest.application.models.User;
import com.ramspringtest.application.services.MainService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String startUpTest() {
        return "Test endpoint working";
    }

    @PostMapping(value = "/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody User user) {
        //add service or 2nd controller
        MainService.createUser(user);
        return user;
    }

    @GetMapping(value = "/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return MainService.getUsers();
    }
}
