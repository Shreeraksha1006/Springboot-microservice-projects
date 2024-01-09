package com.demo.springboot.AutoUserMapper;


import com.demo.springboot.UserDto.UserDto;
import com.demo.springboot.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//Democode from mapstruct
/*@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class ); 3



    CarDto carToCarDto(Car car); 2
}
*/
@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper( AutoUserMapper.class );
    UserDto mapToUserDto(User user);
    // custom mapping with this,
    // @Mapping(source = "numberOfSeats", target = "seatCount")
    User mapToUser(UserDto userDto);
    //Here source is dto, target is user
    //No Implementation required
}
