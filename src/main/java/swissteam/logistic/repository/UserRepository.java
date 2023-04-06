package swissteam.logistic.repository;

import org.springframework.data.repository.CrudRepository;
import swissteam.logistic.model.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
