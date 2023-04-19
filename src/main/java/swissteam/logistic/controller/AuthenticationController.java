package swissteam.logistic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import swissteam.logistic.model.auth.AuthenticationRequest;
import swissteam.logistic.model.auth.AuthenticationResponse;
import swissteam.logistic.model.auth.RegisterRequest;
import swissteam.logistic.service.AuthenticationService;

@CrossOrigin
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterRequest request) {
        if (service.register(request).getToken() == null) {
            return new ResponseEntity<Object>("el usuario ya existe", HttpStatus.CONFLICT);
        }
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<Object> authenticate(@RequestBody AuthenticationRequest request) {
        try {
            return ResponseEntity.ok(service.authenticate(request));
        } catch (ResponseStatusException e) {
            return new ResponseEntity<Object>(e.getBody(), HttpStatus.CONFLICT);
        }

    }
}
