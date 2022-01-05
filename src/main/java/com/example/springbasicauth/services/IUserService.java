package com.example.springbasicauth.services;

import com.example.springbasicauth.entities.User;

import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);

}
