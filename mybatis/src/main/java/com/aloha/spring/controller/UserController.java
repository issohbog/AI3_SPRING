package com.aloha.spring.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aloha.spring.dto.User;
import com.aloha.spring.service.UserService;

@Controller
public class UserController {

	private static final Logger logger 
			= LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/join")
	public void join(@ModelAttribute User user) {		// user 변수명 그대로 model에 등록
						// 유효성 검사 후 기존의 입력 값을 넣어줘야 해서 user를 가져온다. 
	}
	
	@PostMapping("/join")
	public String joinPOST(
			@Validated @ModelAttribute User user, 
			BindingResult bindingResult
	) throws Exception {
		// 유효성 검사 
		if (bindingResult.hasErrors()) {
			return "join";
		}
		boolean result = userService.insert(user);
		if ( result )
			return "redirect:/";
		else 
			return "join";
			
	}
	
	
	@GetMapping("/login")
	public String select() throws Exception {
		return "/login";
	}
	
	@PostMapping("/login")
	public String select( HttpSession session, @RequestParam String id, @RequestParam String password) throws Exception {
		User user = userService.select(id, password);
		
		if (user != null ) {
			session.setAttribute("loginUser", user);
			return "redirect:/";
		} else {
			return "redirect:/login?error";
		}
		
	}
	
	
	
	
	
	
	
	
	
}
