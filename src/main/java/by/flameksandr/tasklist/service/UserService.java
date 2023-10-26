package by.flameksandr.tasklist.service;

import by.flameksandr.tasklist.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getById(Long id);

    User getByUserName(String username);

    User update(User user);

    User create(User user);

    boolean idTaskOwner(Long userId, Long taskId);

    void delete(Long id);
}
