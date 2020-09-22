package com.grouptravelgo.webapp;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserSignupInfo, String>{
	
	 public List<UserSignupInfo> findByLogin(String login);
	 public List<UserSignupInfo> findByEmail(String email);
	 public List<UserSignupInfo> findAll();
}
