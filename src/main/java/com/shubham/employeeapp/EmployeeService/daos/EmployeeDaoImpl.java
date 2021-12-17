package com.shubham.employeeapp.EmployeeService.daos;

import com.shubham.employeeapp.EmployeeService.entities.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private static HashMap<Integer, Employee> employeeData = new HashMap<>();

    /**
     * Helps to initialize the map employeeData
     * this method, gets called after the constructor call
     */
    @PostConstruct
    private void fillUsers(){
        employeeData.put(1, new Employee(1, "Ram", "Manager"));
        employeeData.put(2, new Employee(2, "Mohan", "Engineer"));
        employeeData.put(3, new Employee(3, "Shyam", "Developer"));
        employeeData.put(4, new Employee(4, "James", "QA"));
        employeeData.put(5, new Employee(5, "Ali", "Auditor"));
        employeeData.put(6, new Employee(6, "Sunny", "CEO"));
        employeeData.put(7, new Employee(7, "John", "CFO"));
    }

    @Override
    public Employee getEmployeeDetails(int employeeId) {
        return employeeData.get(employeeId);
    }

    @Override
    public List<Employee> getAllEmployee() {
        Collection<Employee> employeeCollection = employeeData.values();
        Iterator<Employee> employeeIterator = employeeCollection.iterator();
        List<Employee> employees = new ArrayList<>();
        while (employeeIterator.hasNext()){
            employees.add(employeeIterator.next());
        }
        return employees;
    }

    @Override
    public Employee saveEmployeeDetails(Employee employee) {
        employeeData.put(employee.getId(), employee);
        return employee;
    }
}
