package com.shubham.employeeapp.EmployeeService.daos;

import com.shubham.employeeapp.EmployeeService.entities.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ProductDaoImpl implements ProductDao{

    private static HashMap<Integer, Product> productData = new HashMap<>();

    /**
     * Helps to initialize the map employeeData
     * this method, gets called after the constructor call
     */
    @PostConstruct
    private void fillProducts(){
        productData.put(1, new Product(11, "Kitkat", 20));
        productData.put(1, new Product(12, "Dairy Milk", 80));
        productData.put(1, new Product(13, "Munch", 10));
        productData.put(1, new Product(14, "Bournville", 100));
        productData.put(1, new Product(15, "Snickers", 40));
        productData.put(1, new Product(16, "Ferrero Rocher", 250));
        productData.put(1, new Product(17, "Nutella", 100));
    }

    @Override
    public Product getProductDetails(int productId) {
        return productData.get(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        Collection<Product> productCollection = productData.values();
        Iterator<Product> productIterator = productCollection.iterator();
        List<Product> products = new ArrayList<>();
        while (productIterator.hasNext()){
            products.add(productIterator.next());
        }
        return products;
    }

    @Override
    public Product saveProductDetails(Product product) {
        productData.put(product.getId(), product);
        return product;
    }
}
