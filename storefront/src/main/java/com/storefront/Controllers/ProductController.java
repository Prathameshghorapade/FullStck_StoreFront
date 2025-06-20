package com.storefront.Controllers;

import com.storefront.Model.Product;
import com.storefront.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/storefront/product")
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
