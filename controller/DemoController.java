package com.ty.springbootfood.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springbootfood.dto.FoodProduct;
import com.ty.springbootfood.dto.Item;
import com.ty.springbootfood.dto.User;
import com.ty.springbootfood.services.ItemService;
import com.ty.springbootfood.services.UserService;
import com.ty.springbootfood.services.FoodproductService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class DemoController {
//	@Autowired
//	UserService userService;
//	@Autowired
//	ItemService itemService;
	@Autowired
	FoodproductService foodProductService;
//	@PostMapping("/addusers")
//	public User saveUser(@RequestBody User user) {
//		return userService.saveUser(user);
//	}
//	@GetMapping("/users")
//	public List<User> getAllUsers(){
//		return userService.getAllUsers();
//	}
//		@GetMapping("/items")
//		public List<Item> getAllItems() {
//			return itemService.getAllItems();
//		}
//
//		@PostMapping("/addItem")
//		public Item saveItem(@RequestBody Item item) {
//			return itemService.saveItem(item);
//		}
		@PostMapping("/addproducts")
		public FoodProduct saveFoodProduct(@RequestBody FoodProduct foodProduct) {
			return foodProductService.add(foodProduct);
		}
		
	}
