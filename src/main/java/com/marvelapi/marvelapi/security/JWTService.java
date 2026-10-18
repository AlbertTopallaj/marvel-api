package com.marvelapi.marvelapi.security;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JWTService {

    private final String SECRET = "{secret}";

    public String generateToken(String username) {
        return Jwts.builder()
                .subject()
    }
}
