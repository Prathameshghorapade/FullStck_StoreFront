package com.storefront.Controllers;

import com.storefront.Model.Category;
import com.storefront.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/storefront")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/add")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }
}
