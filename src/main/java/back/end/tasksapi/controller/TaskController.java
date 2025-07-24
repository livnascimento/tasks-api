package back.end.tasksapi.controller;

import back.end.tasksapi.dto.TaskDTO;
import back.end.tasksapi.model.Task;
import back.end.tasksapi.model.User;
import back.end.tasksapi.service.TaskService;
import back.end.tasksapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {

        try {
            return ResponseEntity.ok(taskService.createTask(task));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasksByUser(User user) {
        try {
            return ResponseEntity.ok(taskService.findByUserId(user));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<Task> updateTask(@RequestBody Task task) {
        try {
            return ResponseEntity.ok(taskService.updateTask(task));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Task> deleteTask(@RequestBody Task task) {
        try {
            taskService.deleteTask(task);
            return ResponseEntity.ok(task);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
