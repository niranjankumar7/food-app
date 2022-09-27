package com.ty.springbootfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.springbootfood.dto.Item;



public interface ItemRepository extends JpaRepository<Item, Integer> {

}