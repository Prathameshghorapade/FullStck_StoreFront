package com.storefront.Controllers;

import com.storefront.Model.Product;
import com.storefront.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storefront/product")
@CrossOrigin("http://localhost:5173/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get-all")
    public List<Product> getAllproducts(){

       return productService.getAllProducts();
    }


    @GetMapping("/get/{categoryid}")
    public List<Product> getAllproductsById(@PathVariable Long categoryid){

        return productService.getProductById(categoryid);
    }






}
