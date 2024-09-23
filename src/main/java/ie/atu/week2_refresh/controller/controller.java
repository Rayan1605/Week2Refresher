package ie.atu.week2_refresh.controller;

import ie.atu.week2_refresh.Entity.Product;
import ie.atu.week2_refresh.service.service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Product")
public class controller {

    private service functions;

    @GetMapping("/GET")
    public List<Product> GetProduct(){
        return functions.GetProduct();
    }

    @PostMapping("/add")
    public String AddProduct(@RequestBody Product product){
        functions.addProduct(product);
        return "Added product successfully";
    }
    @PutMapping("/update")
    public String UpdateProduct(@RequestBody Product product){
        return functions.UpdateProduct(product);
    }
    @PutMapping("/delete")
    public String DeleteProduct(@RequestBody Product product){
        return functions.deleteProduct(product);
    }


}
