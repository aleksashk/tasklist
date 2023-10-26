package by.flameksandr.tasklist.web.mappers;

import by.flameksandr.tasklist.domain.user.User;
import by.flameksandr.tasklist.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
