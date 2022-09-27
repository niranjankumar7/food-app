package com.ty.springbootfood.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springbootfood.dao.UserDao;
import com.ty.springbootfood.dto.User;

@Service
public class UserService {
@Autowired
UserDao userDao;
 
public User saveUser(User user) {
	return userDao.addUser(user);
}
public List<User> getAllUsers(){
	return userDao.getAllUsers();
	
}
//public void delete(int id) {
//	userDao.deleteUser(id);
//}
}
 