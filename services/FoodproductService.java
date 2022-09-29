package com.ty.springbootfood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.ty.springbootfood.dao.FoodProductDao;
import com.ty.springbootfood.dto.FoodProduct;
@Service
public class FoodproductService {
	@Autowired
	FoodProductDao  foodProductDao;
	
	public FoodProduct add(FoodProduct foodProduct) {
		return foodProductDao.add(foodProduct);
	}
	
	
	public List<FoodProduct > getProducts(){
		return foodProductDao.getProducts();
	}


	public static FoodProduct saveFoodProduct(FoodProduct foodProduct) {
	
		return null;
	}
}
