package com.ty.springboot.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.ty.springboot.dto.User;
import com.ty.springboot.repository.userrepository;



@Repository
public class userDao {



   
    @Autowired
    userrepository userRepository;
    
    public User saveUser(User user) {
    	 return userRepository.save(user);
    }
    
}
