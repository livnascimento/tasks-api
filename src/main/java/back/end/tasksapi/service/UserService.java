package back.end.tasksapi.service;

import back.end.tasksapi.model.User;

import java.util.List;

public interface UserService {
    User findById(String id);
    List<User> findAll();
    User create(User user);
    User update(User user);
    void delete(String id);
}
