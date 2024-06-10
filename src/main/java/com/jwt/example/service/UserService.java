package com.jwt.example.service;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"milind","milinddev1011@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"rahul","rahul@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"sourabh","sourabh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"gautam","gautam@gmail.com"));
    }
    public List<User> getUsers(){
        return  this.store;
    }
}
