package com.mohsinkd786.service;

import com.mohsinkd786.entity.User;
import com.mohsinkd786.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;
    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll(){
        return repository.findAll();
    }
    public User save(User user){
        return  repository.save(user);
    }
}
