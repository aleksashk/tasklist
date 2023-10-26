package by.flameksandr.tasklist.domain.trask;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime expirationDate;
}
