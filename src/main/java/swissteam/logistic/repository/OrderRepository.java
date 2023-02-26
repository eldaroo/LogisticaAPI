package swissteam.logistic.repository;

import org.springframework.data.repository.CrudRepository;
import swissteam.logistic.model.OrderModel;

public interface OrderRepository extends CrudRepository<OrderModel, Integer> {
}
