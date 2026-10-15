package com.ra.identityservice.service;

import com.ra.identityservice.dto.request.RegisterRequest;
import com.ra.identityservice.dto.response.UserResponse;

public interface AuthService {
    UserResponse register(RegisterRequest request);
    String generateTestToken(String username);
}