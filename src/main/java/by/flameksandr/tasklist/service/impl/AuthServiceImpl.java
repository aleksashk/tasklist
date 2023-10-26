package by.flameksandr.tasklist.service.impl;

import by.flameksandr.tasklist.service.AuthService;
import by.flameksandr.tasklist.web.dto.auth.JwtRequest;
import by.flameksandr.tasklist.web.dto.auth.JwtResponse;

public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
