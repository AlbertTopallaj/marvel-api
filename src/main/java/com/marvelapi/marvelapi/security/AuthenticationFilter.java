package com.marvelapi.marvelapi.security;

import com.marvelapi.marvelapi.repositories.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@RequiredArgsConstructor
public class AuthenticationFilter extends OncePerRequestFilter {
    private final JWTService jwtService;
    private final UserRepository userRepository;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        String authenticationHeader = request.getHeader("Authorization");
        if (authenticationHeader == null || authenticationHeader.isBlank() || authenticationHeader.length() <= "Bearer ".length()) {
            filterChain.doFilter(request, response);
            return;
        }


    }
    )
}
