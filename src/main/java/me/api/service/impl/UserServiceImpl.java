package me.api.service.impl;

import me.api.domain.model.User;
import me.api.domain.repository.UserRepository;
import me.api.exceptions.UserExceptionNotFound;
import me.api.exceptions.UserExceptionUnprocessable;
import me.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Optional<User> findById(Long id) {

        Optional<User> userId = userRepository.findById(id);

        if(userId.isEmpty()){
            throw new UserExceptionNotFound("Usuary not found. ID: " + id);
        }

        return userId;
    }

    @Override
    public User createUser(User user) {

        if(user.getId() != null && userRepository.existsById(user.getId())){
            throw new UserExceptionUnprocessable("Usuary already exists.");
        }

        return userRepository.save(user);
    }
}
