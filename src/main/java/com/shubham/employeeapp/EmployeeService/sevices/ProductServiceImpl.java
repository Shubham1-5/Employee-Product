package com.shubham.employeeapp.EmployeeService.sevices;

import com.shubham.employeeapp.EmployeeService.daos.ProductDao;
import com.shubham.employeeapp.EmployeeService.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(int productId) {
        try {
            //Simulate backend service by forcing thread to sleep
            Thread.sleep(1000*5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productDao.getProductDetails(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        try {
            //Simulate backend service by forcing thread to sleep
            Thread.sleep(1000*5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productDao.getAllProducts();
    }

    @Override
    public Product saveProductDetails(Product product) {
        productDao.saveProductDetails(product);
        return product;
    }
}
