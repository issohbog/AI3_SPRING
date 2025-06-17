package com.aloha.spring.service;

import java.util.Map;

import com.aloha.spring.dto.User;

public interface UserService {
	public boolean insert(User user) throws Exception;
	
	public User select(String id, String pw) throws Exception;
}
