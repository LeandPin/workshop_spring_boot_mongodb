package com.leandeson.workshopmongo.resources;

import com.leandeson.workshopmongo.domain.User;
import com.leandeson.workshopmongo.dto.UserDTO;
import com.leandeson.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll(){

        List<User> list = userService.findAll();
        List<UserDTO> dtoList = list.stream().map(x ->  new UserDTO(x)).collect(Collectors.toList());



        return ResponseEntity.ok().body(dtoList);

    }
}
