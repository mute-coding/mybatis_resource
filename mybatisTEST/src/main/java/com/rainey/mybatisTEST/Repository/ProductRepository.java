package com.rainey.mybatisTEST.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.rainey.mybatisTEST.Model.Product;

@Mapper
public interface ProductRepository {
	@Select("SELECT * FROM mybatisTEST")
	public List<Product> getAll();
		
	
}
