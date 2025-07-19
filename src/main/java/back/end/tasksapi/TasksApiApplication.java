package back.end.tasksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ResourceBundle;

@SpringBootApplication
public class TasksApiApplication {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("i18n.messages");

        SpringApplication.run(TasksApiApplication.class, args);
    }

}
