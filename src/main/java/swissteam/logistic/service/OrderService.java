package swissteam.logistic.service;

import swissteam.logistic.exception.ApiRequestException;
import swissteam.logistic.model.OrderModel;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<OrderModel> getOrders() throws ApiRequestException;
    OrderModel save(OrderModel order) throws ApiRequestException;
    void remove(Integer id) throws ApiRequestException;

    Optional<OrderModel> getOrderById(Integer id);
}
