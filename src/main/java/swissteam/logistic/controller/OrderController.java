package swissteam.logistic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swissteam.logistic.exception.ApiRequestException;
import swissteam.logistic.model.OrderModel;
import swissteam.logistic.service.impl.OrderServiceImpl;

import java.util.List;

@RestController
@CrossOrigin
public class OrderController {

    private final OrderServiceImpl service;

    public OrderController(OrderServiceImpl service) {
        this.service = service;
    }

    @GetMapping(path = "order")
    public ResponseEntity getOrders() {
        try {
            return new ResponseEntity<>(service.getOrders(), HttpStatus.ACCEPTED);
        } catch (ApiRequestException e) {
            return new ResponseEntity<>(e.getMessage(), e.getHttpStatus());
        }
    }

    @GetMapping(path="order/{id}")
    public ResponseEntity getOrderById(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<>(service.getOrderById(id), HttpStatus.ACCEPTED);
        } catch (ApiRequestException e) {
            return new ResponseEntity<>(e.getMessage(), e.getHttpStatus());

        }
    }

    @PostMapping(path="order/save")
    public OrderModel save(@RequestBody OrderModel order){
        return service.save(order);
    }

    @DeleteMapping(path="order/{id}")
    public ResponseEntity remove(@PathVariable("id") Integer id) {
        try {
            service.remove(id);
            return new ResponseEntity<>("La orden "+id+" fue eliminada con éxito", HttpStatus.ACCEPTED);
        } catch (ApiRequestException e) {
            return new ResponseEntity<>(e.getMessage(), e.getHttpStatus());
        }
    }
}
