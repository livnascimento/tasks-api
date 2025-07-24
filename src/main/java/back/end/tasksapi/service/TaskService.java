package back.end.tasksapi.service;

import back.end.tasksapi.model.Task;
import back.end.tasksapi.model.User;
import back.end.tasksapi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final UserService userService;

    @Autowired
    public TaskService(TaskRepository taskRepository,  UserService userService) {
        this.taskRepository = taskRepository;
        this.userService = userService;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Task request) {
        return taskRepository.findById(request.getId());
    }

    public Task createTask(Task request) {
        User user = userService.getAuthenticatedUser();

        Task task = new Task();
        task.setUser(user);
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setStatus(request.getStatus());

        return taskRepository.save(task);
    }

    public Task updateTask(Task request) {
        Task task = findById(request);

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setStatus(request.getStatus());

        return taskRepository.save(task);
    }

    public void deleteTask(Task request) {
        Task task = findById(request);
        taskRepository.delete(task);
    }

    public List<Task> findByUserId(User user) {
        return findByUserId(user);
    }
}
