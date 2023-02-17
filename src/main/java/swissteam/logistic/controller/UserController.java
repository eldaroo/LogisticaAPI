package swissteam.logistic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swissteam.logistic.model.UserModel;
import swissteam.logistic.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping(path = "user/save")
    public UserModel save (@RequestBody UserModel user) {
        return repository.save(user);
    }

    @GetMapping(path = "user")
    public List<UserModel> getAll() {
        return (List<UserModel>) repository.findAll();
    }

    @GetMapping(path = "user/{id}")
    public ResponseEntity getById(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
