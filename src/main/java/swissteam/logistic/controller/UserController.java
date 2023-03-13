package swissteam.logistic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swissteam.logistic.model.UserModel;
import swissteam.logistic.repository.UserRepository;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping(path = "/save")
    public UserModel save (@RequestBody UserModel user) {
        return repository.save(user);
    }


    @GetMapping()
    public List<UserModel> getAll() {
        return (List<UserModel>) repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity getById(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
