package ie.atu.week2_refresh.controller;

import ie.atu.week2_refresh.Entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class controller {

    private List<Product> productList;

    @GetMapping("/GET")
    public List<Product> GetProduct(){
        return productList;
    }

    @PostMapping("/add")
    public String AddProduct(@RequestBody Product product){
        productList.add(product);
        return "Added product successfully";
    }


}
