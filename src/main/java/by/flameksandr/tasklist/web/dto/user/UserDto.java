package by.flameksandr.tasklist.web.dto.user;

import by.flameksandr.tasklist.domain.trask.Task;
import by.flameksandr.tasklist.domain.user.Role;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
}
