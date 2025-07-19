package back.end.tasksapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String userId;
    private String title;
    private String description;
    private String status;
}
