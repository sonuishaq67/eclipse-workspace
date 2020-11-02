package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
   @RequestMapping("/AllEmployees")
    public List<Employee> getEmployees() 
    {
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
      employeesList.add(new Employee(1,"lokesh1","gupta","howtodoinjava@gmail.com"));
      employeesList.add(new Employee(1,"lokesh2","gupta","howtodoinjava@gmail.com"));
      employeesList.add(new Employee(1,"lokesh3","gupta","howtodoinjava@gmail.com"));
      
      return employeesList;
    }
}