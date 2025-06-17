package com.aloha.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.spring.dto.User;
import com.aloha.spring.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean insert(User user) throws Exception {
		int result = userMapper.insert(user);
		if (result > 0)
			return true;	
		return false;
	}

	@Override
	public User select(String id, String password) throws Exception {
		Map<String, Object> param = new HashMap<>();
		param.put("id", id);
		param.put("password", password);
		User user = userMapper.select(param);
		return user;
	}

}
