package com.example.user_service.service;
 
import org.springframework.stereotype.Service;
import com.example.user_service.model.User;
import com.example.user_service.repository.UserRepository;
 
import java.util.List;
 
@Service
public class UserService {
 
    private final UserRepository repo;
 
    public UserService(UserRepository repo) {
        this.repo = repo;
    }
 
    public User createUser(User user) {
        return repo.save(user);
    }
 
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUserById(Long id) {
    return repo.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
}
}