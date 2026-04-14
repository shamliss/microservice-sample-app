package com.example.product_service.service;
 
import org.springframework.stereotype.Service;
import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepository;
 
import java.util.List;
 
@Service
public class ProductService {
 
    private final ProductRepository repo;
 
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }
 
    public Product createProduct(Product product) {
        return repo.save(product);
    }
 
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}