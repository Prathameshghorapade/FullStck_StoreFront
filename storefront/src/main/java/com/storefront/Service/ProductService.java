package com.storefront.Service;

import com.storefront.Model.Product;
import com.storefront.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;


    public List<Product> getAllProducts(){

        return productRepo.findAll();
    }


    public List<Product> getProductById(Long categoryId){
        return productRepo.findByCategoryId(categoryId);
    }
}
