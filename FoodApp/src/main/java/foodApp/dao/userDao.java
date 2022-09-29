package foodApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import foodApp.dto.user;
import foodApp.repository.userRepository;

@Repository
public class userDao {
	@Autowired
	userRepository userRepository;
	
	public user saveUser(user User) {
		return userRepository.save(User);
	}
}
