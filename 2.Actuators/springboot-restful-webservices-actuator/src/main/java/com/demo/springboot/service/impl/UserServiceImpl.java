package com.demo.springboot.service.impl;

import com.demo.springboot.AutoUserMapper.AutoUserMapper;
import com.demo.springboot.Exception.EmailAlreadyExistsException;
import com.demo.springboot.Exception.ResourceNotFoundException;
import com.demo.springboot.repository.UserRepository;
import lombok.AllArgsConstructor;
import com.demo.springboot.UserDto.UserDto;
import com.demo.springboot.entity.User;
import com.demo.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = AutoUserMapper.MAPPER.mapToUser(userDto);
        Optional<User> userViaEmail=userRepository.findByEmail(user.getEmail());
        if(userViaEmail.isPresent())
            throw new EmailAlreadyExistsException("Email Already exists");

        User savedUser = userRepository.save(user);
        UserDto savedUserDto=AutoUserMapper.MAPPER.mapToUserDto(savedUser);
        return savedUserDto;
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));
        UserDto getUserDto=AutoUserMapper.MAPPER.mapToUserDto(user);
        return getUserDto;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        //Below statement
        //take each users.stream will iterate though each user in users, ten we are calling map function,
        //mapping each user to mapToUserDto and adding the result to toList method
       // return users.stream().map(userMapper::mapToUserDto).toList();
        return users.stream().map((user)->AutoUserMapper.MAPPER.mapToUserDto(user)).toList();

    }

    @Override
    public UserDto updateUser(UserDto user) {
        User existingUser = userRepository.findById(user.getId()).orElseThrow(() -> new ResourceNotFoundException("User", "id", user.getId()));
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        return AutoUserMapper.MAPPER.mapToUserDto(updatedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        User existingUser = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        userRepository.deleteById(userId);
    }


}
