package com.example.back.service;
import com.example.back.model.NewUser;
import com.example.back.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserService  {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public void create(String username, String password) {
        NewUser user = new NewUser();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
    }
}
