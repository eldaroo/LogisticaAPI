package swissteam.logistic.repository;

import org.springframework.data.repository.CrudRepository;
import swissteam.logistic.model.UserModel;
import java.util.Optional;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
    Optional<UserModel> findByUsername(String username);
}
