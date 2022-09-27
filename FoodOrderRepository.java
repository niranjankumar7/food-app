package com.ty.springbootfood.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.springbootfood.dto.FoodOrder;

	public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {

	}

