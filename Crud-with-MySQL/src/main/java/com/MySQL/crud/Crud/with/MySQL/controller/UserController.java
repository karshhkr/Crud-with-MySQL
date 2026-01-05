package com.MySQL.crud.Crud.with.MySQL.controller;

import com.MySQL.crud.Crud.with.MySQL.models.CreateUserRequest;
import com.MySQL.crud.Crud.with.MySQL.models.UpdateUserRequest;
import com.MySQL.crud.Crud.with.MySQL.models.User;
import com.MySQL.crud.Crud.with.MySQL.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(
            @RequestBody CreateUserRequest createUserRequest) {
        userService.createUser(createUserRequest);
        return ResponseEntity
                .ok().body("User Created Sucessfully");

    }
@GetMapping
    public ResponseEntity<List <User>>getAllUser() {

        return ResponseEntity.ok().body(userService.getAllUser());
    }
    @PatchMapping("/{id}")
     public ResponseEntity<String> updateUser(@PathVariable String id,@RequestBody UpdateUserRequest updateUserRequest) {
        userService.updateUser(id, updateUserRequest);
         return ResponseEntity
                 .ok().body("User Updated Sucessfully");

     }@DeleteMapping("/{id}")
      public ResponseEntity<String> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
          return ResponseEntity
                  .ok().body("User Deleted Sucessfully");
      }
}

