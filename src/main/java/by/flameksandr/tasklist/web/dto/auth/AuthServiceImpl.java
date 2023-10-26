package by.flameksandr.tasklist.web.dto.auth;

import by.flameksandr.tasklist.service.AuthService;

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
