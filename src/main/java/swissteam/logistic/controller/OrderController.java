package swissteam.logistic.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swissteam.logistic.exception.ApiRequestException;
import swissteam.logistic.model.Order;
import swissteam.logistic.service.impl.OrderServiceImpl;
import com.google.gson.Gson;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

    private final OrderServiceImpl service;
    private static final Gson gson = new Gson();

    public OrderController(OrderServiceImpl service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity getOrders() {
        try {
            return new ResponseEntity<>(service.getOrders(), HttpStatus.ACCEPTED);
        } catch (ApiRequestException e) {
            return new ResponseEntity<>(e.getErrorMessage(), e.getHttpStatus());
        }
    }

    @GetMapping(path="/{id}")
    public ResponseEntity getOrderById(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<>(service.getOrderById(id), HttpStatus.ACCEPTED);
        } catch (ApiRequestException e) {
            return new ResponseEntity<>(gson.toJson(e.getErrorMessage()), e.getHttpStatus());

        }
    }

    @PostMapping(path="/save")
    public Order save(@RequestBody Order order){
        return service.save(order);
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity remove(@PathVariable("id") Integer id) {
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        try {
            service.remove(id);
            return new ResponseEntity<>(gson.toJson("La orden " + id + " fue eliminada con éxito"), httpHeaders, HttpStatus.ACCEPTED);
        } catch (ApiRequestException e) {
            return new ResponseEntity<>(e.getErrorMessage(), httpHeaders, e.getHttpStatus());
        }
    }
}
