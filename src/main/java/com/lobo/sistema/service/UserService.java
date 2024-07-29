package com.lobo.sistema.service;

import com.lobo.sistema.dto.UserDTO;
import com.lobo.sistema.model.User;
import com.lobo.sistema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User save(UserDTO userDTO) {
        User entity = new User(
                userDTO.getUsername(),
                userDTO.getEmail(),
                passwordEncoder.encode(userDTO.getPassword())
        );

        return userRepository.save(entity);
    }
}
