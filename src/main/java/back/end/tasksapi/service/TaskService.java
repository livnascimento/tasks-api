package back.end.tasksapi.service;

import back.end.tasksapi.model.Task;
import back.end.tasksapi.model.User;

import java.util.List;

public interface TaskService {
    Task findById(String id);
    List<Task> findAllByUser(User user);
    List<Task> findAllByUserAndStatus(User user, String status);

}
