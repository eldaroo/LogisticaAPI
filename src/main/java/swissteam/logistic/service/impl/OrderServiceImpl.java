package swissteam.logistic.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import swissteam.logistic.exception.ApiRequestException;
import swissteam.logistic.model.Order;
import swissteam.logistic.repository.OrderRepository;
import swissteam.logistic.service.OrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getOrders() {
        try {
            return (List<Order>) repository.findAll();
        } catch (Exception e) {
            throw new ApiRequestException("error intentando obtener las ordenes", HttpStatus.CONFLICT);
        }
    }

    public Order save(@RequestBody Order order) {
        try {
            return repository.save(order);
        } catch (Exception e) {
            throw new ApiRequestException("error intentando salvar una nueva orden", HttpStatus.CONFLICT);
        }
    }

    public void remove(Integer id) {
        if (!repository.existsById(id)) {
            throw new ApiRequestException("La orden que intenta eliminar no fue encontrada", HttpStatus.NOT_FOUND);
        }
        repository.deleteById(id);
    }

    @Override
    public Optional<Order> getOrderById(Integer id) {
        if (!repository.existsById(id)) {
            throw new ApiRequestException("El usuario al que intenta acceder no fue encontrado", HttpStatus.NOT_FOUND);
        } else {
            return repository.findById(id);
        }
    }

/*    public void update(Integer id) {
        if (!repository.existsById(id)) {
            throw new ApiRequestException("El usuario que intenta modificar no fue encontrado", HttpStatus.NOT_FOUND);
        }
        repository.findById(id).;
    }*/
}
