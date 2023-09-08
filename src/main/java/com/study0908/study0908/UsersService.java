package com.study0908.study0908;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsersService {
    private final UsersRepository usersRepository;

    public List<UsersResponseDTO> userList(){
        List<Users> users;
        List<UsersResponseDTO> usersResponseDTOs = new ArrayList<>();

        try{
            users = usersRepository.findAll();;
            users.forEach(user -> usersResponseDTOs.add(new UsersResponseDTO(user.getId(), user.getEmail())));
        }catch(Exception e){
            log.error("UserService userList error", e);
        }
        
        return usersResponseDTOs;
    }


}
