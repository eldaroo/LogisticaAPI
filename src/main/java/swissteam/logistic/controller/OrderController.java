package swissteam.logistic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import swissteam.logistic.model.OrderModel;
import swissteam.logistic.repository.OrderRepository;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "order")
    public List<OrderModel> getOrders() {
        return (List<OrderModel>) repository.findAll();
    }

    @PostMapping(path="order/save")
    public OrderModel save(@RequestBody OrderModel order){
        return repository.save(order);
    }
}
