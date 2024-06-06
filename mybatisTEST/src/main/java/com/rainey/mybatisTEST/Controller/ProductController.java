package com.rainey.mybatisTEST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rainey.mybatisTEST.Model.Product;
import com.rainey.mybatisTEST.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/list")
	public List<Product> getList(){
		return productService.getAll();
	}
}
