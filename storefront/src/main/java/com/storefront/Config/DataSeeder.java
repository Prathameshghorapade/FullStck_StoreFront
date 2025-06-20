package com.storefront.Config;

import com.storefront.Model.Category;
import com.storefront.Model.Product;
import com.storefront.Repo.CategoryRepo;
import com.storefront.Repo.ProductRepo;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private  ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;


    @Override
    public void run(String... args) throws Exception {

        productRepo.deleteAll();
        categoryRepo.deleteAll();


        // Create Categories

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home");

        Category kitchen = new Category();
        kitchen.setName("Kitchen");

        categoryRepo.saveAll(Arrays.asList(electronics,clothing,home,kitchen));





        // Create Products

        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("New Smartphone With Amazing Features");
        phone.setPrice(9999.90);
        phone.setCategory(electronics);
        phone.setImageUrl("https://placehold.co/400");



        Product laptop = new Product();
        laptop.setName("LapTop");
        laptop.setDescription("New LopTop With Amazing Features");
        laptop.setPrice(88888.90);
        laptop.setCategory(electronics);
        laptop.setImageUrl("https://placehold.co/400");


        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("New Winter Jacket");
        jacket.setPrice(6767.8);
        jacket.setCategory(clothing);
        jacket.setImageUrl("https://placehold.co/400");


        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("New Blender");
        blender.setPrice(3455.5);
        blender.setCategory(home);
        blender.setImageUrl("https://placehold.co/400");


        productRepo.saveAll(Arrays.asList(phone,laptop,jacket,blender));













    }
}
