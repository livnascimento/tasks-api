package back.end.tasksapi.repository;

import back.end.tasksapi.model.Task;
import back.end.tasksapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    Task findById(UUID id);
    List<Task> findByUserId(User user);
}
