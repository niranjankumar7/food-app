package com.ty.springbootfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.springbootfood.dto.Branch;



public interface BranchRepository extends JpaRepository<Branch, Integer> {

}