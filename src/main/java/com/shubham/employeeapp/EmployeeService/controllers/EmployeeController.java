package com.shubham.employeeapp.EmployeeService.controllers;

import com.shubham.employeeapp.EmployeeService.entities.Employee;
import com.shubham.employeeapp.EmployeeService.entities.Product;
import com.shubham.employeeapp.EmployeeService.sevices.EmployeesService;
import com.shubham.employeeapp.EmployeeService.sevices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private ProductService productService;

    /**
     * since service is taking time, so first time call the service for id and cache it locally
     * next time return the cached result for the same id
     * @param id
     * @return
     */
    @GetMapping("/employees/{id}")
    public ResponseEntity searchEmployeeById(@PathVariable("id") int id) {

        /**
         * caching logic with guava cache
         */

        Employee savedEmployee = employeesService.getEmployeeById(id);
        return new ResponseEntity(savedEmployee, HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity getProductNameById(@PathVariable("id") int id) {

        /**
         * caching logic with guava cache
         */

        Product savedProduct = productService.getProductById(id);
        return new ResponseEntity(savedProduct.getName(), HttpStatus.OK);
    }
}
