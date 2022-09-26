package com.ty.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.ty.springboot.dto.User;



public interface userrepository extends JpaRepository<User, Integer>{



}