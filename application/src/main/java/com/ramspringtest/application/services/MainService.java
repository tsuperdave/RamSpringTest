package com.ramspringtest.application.services;

import com.ramspringtest.application.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {

    static List<User> listOfUsers = new ArrayList<>();

    public static void createUser(User user) {
        listOfUsers.add(user);
    }

    public static List<User> getUsers() {
        return listOfUsers;
    }
}
