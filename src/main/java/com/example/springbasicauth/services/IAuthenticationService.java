package com.example.springbasicauth.services;

import com.example.springbasicauth.entities.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User user);
}
