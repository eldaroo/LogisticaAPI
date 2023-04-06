package swissteam.logistic.service;

import swissteam.logistic.exception.ApiRequestException;
import swissteam.logistic.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getOrders() throws ApiRequestException;
    Order save(Order order) throws ApiRequestException;
    void remove(Integer id) throws ApiRequestException;

    Optional<Order> getOrderById(Integer id);
}
