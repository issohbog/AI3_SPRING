package com.aloha.spring.mapper;

import java.util.Map;

import com.aloha.spring.dto.User;

public interface UserMapper {
	
	public int insert(User user) throws Exception;
	
	public User select(Map<String, Object> param);
}
