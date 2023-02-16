package swissteam.logistic.repository;

import org.springframework.data.repository.CrudRepository;
import swissteam.logistic.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
