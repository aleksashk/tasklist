package by.flameksandr.tasklist.web.dto.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime expirationDate;
}
