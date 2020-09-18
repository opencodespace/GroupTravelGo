package com.grouptravelgo.webapp;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserSignupInfo, String>{
	
	 public UserSignupInfo findByLogin(String firstName);
	 public List<UserSignupInfo> findAll();
}
