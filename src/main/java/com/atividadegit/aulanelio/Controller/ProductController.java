package com.atividadegit.aulanelio.Controller;

import com.atividadegit.aulanelio.Entities.Department;
import com.atividadegit.aulanelio.Entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {


    @GetMapping
    public List<Product> getObjects(){
        Department department1 = new Department(1L, "Tech");
        Department department2 = new Department(2L, "Pet");

        Product p1 = new Product(1L, "MacBook", 4000.0, department1);
        Product p2 = new Product(2L, "Pc Gamer", 5000.0, department1);
        Product p3 = new Product(3L, "Pet House", 300.0, department2);

        List<Product> list = Arrays.asList(p1, p2, p3);
        return list;
    }
}
