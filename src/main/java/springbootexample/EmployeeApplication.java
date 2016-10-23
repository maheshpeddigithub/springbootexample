package springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EmployeeApplication.class, args);
    }

}
