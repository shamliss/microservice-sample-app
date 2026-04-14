package com.example.order_service.service;

import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// Add these imports
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class OrderService {

    private final OrderRepository repo;
    private final RestTemplate restTemplate;

    public OrderService(OrderRepository repo, RestTemplate restTemplate) {
        this.repo = repo;
        this.restTemplate = restTemplate;
    }

    public Order createOrder(Order order) {
     /*   String userUrl = "http://localhost:8081/users/" + order.getUserId();
        Object user = restTemplate.getForObject(userUrl, Object.class);

        String productUrl = "http://localhost:8082/products/" + order.getProductId();
        Object product = restTemplate.getForObject(productUrl, Object.class); */
        System.out.println("Received order: " + order.getUserId() + ", " + order.getProductId());
        

        // URLs for external services
      /*  String userUrl = "http://localhost:8081/users/" + order.getUserId();
        String productUrl = "http://localhost:8082/products/" + order.getProductId();

        try {
            // Call User Service
            ResponseEntity<Object> userResponse = restTemplate.getForEntity(userUrl, Object.class);
            if (!userResponse.getStatusCode().is2xxSuccessful() || userResponse.getBody() == null) {
                throw new RuntimeException("User not found with ID: " + order.getUserId());
            }

            // Call Product Service
            ResponseEntity<Object> productResponse = restTemplate.getForEntity(productUrl, Object.class);
            if (!productResponse.getStatusCode().is2xxSuccessful() || productResponse.getBody() == null) {
                throw new RuntimeException("Product not found with ID: " + order.getProductId());
            }

        } catch (HttpClientErrorException.NotFound e) {
            throw new RuntimeException("User or Product not found: " + e.getMessage());
        } catch (HttpClientErrorException e) {
            throw new RuntimeException("Error calling external service: " + e.getStatusCode());
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error: " + e.getMessage(), e);
        } */
        return repo.save(order);

    }
}