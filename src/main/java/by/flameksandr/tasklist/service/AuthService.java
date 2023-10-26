package by.flameksandr.tasklist.service;

import by.flameksandr.tasklist.web.dto.auth.JwtRequest;
import by.flameksandr.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
