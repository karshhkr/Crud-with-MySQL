package com.MySQL.crud.Crud.with.MySQL.services;

import com.MySQL.crud.Crud.with.MySQL.dao.UserRepository;
import com.MySQL.crud.Crud.with.MySQL.models.CreateUserRequest;
import com.MySQL.crud.Crud.with.MySQL.models.UpdateUserRequest;
import com.MySQL.crud.Crud.with.MySQL.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    //c
    //r
    //u
    //d

    //create
    public void createUser(CreateUserRequest userRequest) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();

    }
//update
public void updateUser(String id, UpdateUserRequest updateUserRequest) {
        Optional<User> optionalUser = userRepository.findById(id);
if(optionalUser.isEmpty()){
    throw new RuntimeException("User not found With given id: "+id);

}

User user = optionalUser.get();
if(!ObjectUtils.isEmpty(updateUserRequest.getName())){
user.setName(updateUserRequest.getName());
    }
    if(!ObjectUtils.isEmpty(updateUserRequest.getEmail())){
        user.setEmail(updateUserRequest.getEmail());
    }
    userRepository.save(user);


}
public void deleteUser(String id) {
    Optional<User> optionalUser = userRepository.findById(id);
    if(optionalUser.isEmpty()){
        throw new RuntimeException("User not found With given id: "+id);

    }
    userRepository.deleteById(id);
}
}
