package ie.atu.week2_refresh.service;

import ie.atu.week2_refresh.Entity.Product;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    List<Product> Product = new ArrayList<>();

    public List<Product> GetProduct() {
        return Product;
    }

    public void addProduct(Product product){
        Product.add(product);
    }



}
