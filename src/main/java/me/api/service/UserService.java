package me.api.service;

import me.api.domain.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

     Optional<User> findById(Long id);

     User createUser(User user);

}
