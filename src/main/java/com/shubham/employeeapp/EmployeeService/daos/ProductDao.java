package com.shubham.employeeapp.EmployeeService.daos;

import com.shubham.employeeapp.EmployeeService.entities.Product;

import java.util.List;

public interface ProductDao {

    Product getProductDetails(int productId);
    List<Product> getAllProducts();
    Product saveProductDetails(Product product);
}
