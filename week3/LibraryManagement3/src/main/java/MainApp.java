package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.library.entity.Employee;
import com.library.service.EmployeeService;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainApp.class, args);
        EmployeeService service = context.getBean(EmployeeService.class);

        Employee emp = new Employee();
        emp.setName("Neha");
        emp.setSalary(50000);

        service.addEmployee(emp);
        System.out.println("Employee Saved!");
    }
}
