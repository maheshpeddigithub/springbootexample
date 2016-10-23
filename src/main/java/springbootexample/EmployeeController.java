package springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/employeename")
    public String getEmployeeName() {
        return "getEmployeeName is called";
    }

}
