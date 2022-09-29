package com.ty.springbootfood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springbootfood.dao.ItemDao;
import com.ty.springbootfood.dto.Item;
@Service
public class ItemService {
	@Autowired
	ItemDao itemDao;
	
	public Item saveItem(Item item) {
		return itemDao.addItem(item);
	}
	
	public List<Item> getAllItems(){
		return itemDao.getAllItems();
	}
	
}
