package com.shubham.employeeapp.EmployeeService.sevices;

import com.shubham.employeeapp.EmployeeService.daos.EmployeeDao;
import com.shubham.employeeapp.EmployeeService.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee getEmployeeById(int employeeId) {

        /**
         * Business logic is taking time
         */
        try{
            //Simulate backend service by forcing thread to sleep
            Thread.sleep(1000*7);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * DB is not taking time
         */
        return employeeDao.getEmployeeDetails(employeeId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        try {
            //Simulate backend service by forcing thread to sleep
            Thread.sleep(1000*7);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeDao.getAllEmployee();
    }

    @Override
    public Employee saveEmployeeDetails(Employee employee) {
        employeeDao.saveEmployeeDetails(employee);
        return employee;
    }
}
