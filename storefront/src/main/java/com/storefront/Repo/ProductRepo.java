package com.storefront.Repo;

import com.storefront.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {


    List<Product> findByCategoryId(Long categoryId);
    
}
