package com.codewithmosh.store.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author ileanaoneata on 15.05.2025
 */

@Service
public class JwtService {

    public String generateToken(String email) {
        final long tokenExpiration = 86400; // Number of seconds in one day

        return Jwts.builder()
                .subject(email)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000 * tokenExpiration))
                .signWith(Keys.hmacShaKeyFor("secret".getBytes()))
                .compact();
    }
}
