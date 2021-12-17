package com.shubham.employeeapp.EmployeeService.sevices;

import com.shubham.employeeapp.EmployeeService.entities.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(int productId);
    List<Product> getAllProducts();
    Product saveProductDetails(Product product);
}
