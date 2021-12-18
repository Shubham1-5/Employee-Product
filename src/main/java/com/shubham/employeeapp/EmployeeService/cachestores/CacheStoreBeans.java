package com.shubham.employeeapp.EmployeeService.cachestores;

import com.shubham.employeeapp.EmployeeService.entities.Employee;
import com.shubham.employeeapp.EmployeeService.entities.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheStoreBeans {

    @Bean
    public CacheStore<Employee> employeeCache(){
        return new CacheStore<Employee>(60, TimeUnit.SECONDS);
    }

    @Bean
    public CacheStore<Product> productCache(){
        return new CacheStore<Product>(60, TimeUnit.SECONDS);
    }
}
