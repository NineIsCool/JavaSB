package org.example.skillbox_mod4.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.skillbox_mod4.adapter.repository.UserRepository;
import org.example.skillbox_mod4.adapter.web.dto.UserDto;
import org.example.skillbox_mod4.domain.UserEntity;
import org.example.skillbox_mod4.service.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    public List<UserDto> getAll(){
        List<UserEntity> users =  userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for (UserEntity user:users){
            userDtoList.add(userMapper.userToUserDto(user));
        }
        return userDtoList;
    }
    public void add(String name){
        UserEntity user=new UserEntity(name);
        userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
