package com.rainey.mybatisTEST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainey.mybatisTEST.Model.Product;
import com.rainey.mybatisTEST.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public List<Product> getAll(){
		return productRepository.getAll();
	}
}
