package swissteam.logistic.repository;

import org.springframework.data.repository.CrudRepository;
import swissteam.logistic.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
