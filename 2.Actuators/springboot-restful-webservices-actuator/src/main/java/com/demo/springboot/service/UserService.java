package com.demo.springboot.service;

import com.demo.springboot.UserDto.UserDto;

import java.util.List;


public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);

}
