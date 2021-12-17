package com.shubham.employeeapp.EmployeeService.sevices;

import com.shubham.employeeapp.EmployeeService.entities.Employee;

import java.util.List;

public interface EmployeesService {

    Employee getEmployeeById(int employeeId);
    List<Employee> getAllEmployees();
    Employee saveEmployeeDetails(Employee employee);
}
