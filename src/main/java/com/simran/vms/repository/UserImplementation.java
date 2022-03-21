package com.simran.vms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simran.vms.entity.User;
import com.simran.vms.service.UserService;

@Service
public class UserImplementation implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);	
	}

	@Override
	public User getUserById(Long id) {
		Optional<User> findById = userRepository.findById(id);
		User user = null;
		if(findById.isPresent()) {
			user = findById.get();
		}else {
			throw new RuntimeException("Employee not found for ID : " + id);
		}
		return user;
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}

}
