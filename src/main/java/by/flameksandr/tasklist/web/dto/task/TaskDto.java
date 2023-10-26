package by.flameksandr.tasklist.web.dto.task;

import java.time.LocalDateTime;

public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime expirationDate;
}
