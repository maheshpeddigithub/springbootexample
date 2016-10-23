package springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootexample.jpa.entity.Employee;
import springbootexample.jpa.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employeelist")
    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }

    @RequestMapping("/employeename")
    public String getEmployeeName() {
        return "getEmployeeName is called";
    }

}
