package com.cognizant.spring_learn;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        // Step 1: Get Authorization header
        String authHeader = request.getHeader("Authorization");
        System.out.println("Authorization Header = " + authHeader);  // Debug line

        // Step 2: Check if it starts with "Basic "
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            try {
                // Step 3: Extract and decode base64 credentials
                String base64Credentials = authHeader.substring("Basic ".length());
                String credentials = new String(Base64.getDecoder().decode(base64Credentials));
                String[] values = credentials.split(":", 2);

                // Step 4: Extract username and password
                String username = values[0];
                String password = values[1];

                // Step 5: Check credentials (hardcoded here)
                if ("user".equals(username) && "pwd".equals(password)) {
                    // Step 6: Generate JWT token
                    String token = jwtUtil.generateToken(username);
                    return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
                } else {
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                            .body("{\"error\":\"Invalid credentials\"}");
                }
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("{\"error\":\"Error decoding credentials\"}");
            }
        }

        // Step 7: Missing or invalid header
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("{\"error\":\"Missing or invalid Authorization header\"}");
    }
}
