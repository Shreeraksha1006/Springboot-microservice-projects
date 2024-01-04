package net.javaguides.springboot.AutoUserMapper;

import net.javaguides.springboot.UserDto.UserDto;
import net.javaguides.springboot.entity.User;

public class UserMapper {
    public UserDto mapToUserDto(User user){
        UserDto userDto =new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }
    public User mapToUser(UserDto userDto){
        User user =new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
