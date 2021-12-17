package com.shubham.employeeapp.EmployeeService.daos;

import com.shubham.employeeapp.EmployeeService.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee getEmployeeDetails(int employeeId);
    List<Employee> getAllEmployee();
    Employee saveEmployeeDetails(Employee employee);
}
