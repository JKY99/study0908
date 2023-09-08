package com.study0908.study0908;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/user","/user/"})
public class UsersController {
    private final UsersService usersService;

    @GetMapping
    public ResponseEntity<List<UsersResponseDTO>> getUsers(){
        List<UsersResponseDTO> users = usersService.userList();
        if(users.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(users);
        return ResponseEntity.status(HttpStatus.OK).body(users);
    } 
}
