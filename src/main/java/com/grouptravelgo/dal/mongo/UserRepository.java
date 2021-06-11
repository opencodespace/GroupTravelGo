package com.grouptravelgo.dal.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.grouptravelgo.entity.UserSignupInfo;

@Repository
public interface UserRepository extends MongoRepository<UserSignupInfo, String>{
	
	 public List<UserSignupInfo> findByLogin(String login);
	 public List<UserSignupInfo> findByEmail(String email);
	 public List<UserSignupInfo> findByLoginAndPsw(String login, String psw);
	 public List<UserSignupInfo> findAll();
}
