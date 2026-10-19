package com.marvelapi.marvelapi.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import io.jsonwebtoken.Jwts;
import lombok.Value;
import org.springframework.stereotype.Service;

@Service
public class JWTService {

    private final Algorithm algorithm;
    private final JWTVerifier verifier;

    public JWTService(@Value("${jwt.secrete}") String secret){
        this.algorithm = Algorithm.HMAC256(secret);
        this.verifier = JWT.require(algorithm)
                .withIssuer("auth0")
                .build();
    }


}
