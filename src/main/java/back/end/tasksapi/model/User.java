package back.end.tasksapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;
    private String name;
    private String email;
    private String password;
}
