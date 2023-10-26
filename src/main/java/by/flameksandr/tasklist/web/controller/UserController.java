package by.flameksandr.tasklist.web.controller;

import by.flameksandr.tasklist.domain.trask.Task;
import by.flameksandr.tasklist.domain.user.User;
import by.flameksandr.tasklist.service.TaskService;
import by.flameksandr.tasklist.service.UserService;
import by.flameksandr.tasklist.web.dto.task.TaskDto;
import by.flameksandr.tasklist.web.dto.user.UserDto;
import by.flameksandr.tasklist.web.dto.validation.OnCreate;
import by.flameksandr.tasklist.web.dto.validation.OnUpdate;
import by.flameksandr.tasklist.web.mappers.TaskMapper;
import by.flameksandr.tasklist.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto) {
        User user = userMapper.toEntity(dto);
        User updatedUser = userService.update(user);
        return userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        taskService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTaskByUserId(@PathVariable Long id) {
        List<Task> tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public TaskDto create(@PathVariable Long id,
                          @Validated(OnCreate.class) TaskDto dto) {
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task, id);
        return taskMapper.toDto(createdTask);
    }
}
