package by.flameksandr.tasklist.web.mappers;

import by.flameksandr.tasklist.domain.trask.Task;
import by.flameksandr.tasklist.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto taskDto);
}
