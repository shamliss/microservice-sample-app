package com.example.product_service.controller;
 
import org.springframework.web.bind.annotation.*;
import com.example.product_service.model.Product;
import com.example.product_service.service.ProductService;
 
import java.util.List;
 
@RestController
@RequestMapping("/products")
public class ProductController {
 
    private final ProductService service;
 
    public ProductController(ProductService service) {
        this.service = service;
    }
 
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.createProduct(product);
    }
 
    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }
}