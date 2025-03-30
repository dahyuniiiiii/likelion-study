package com.my.likelion_front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/") //서버주소가 "/"일 때(root, 맨위 파일) 실행되는 메서드
	public String home() {
		
		return "home"; //home.jsp패이지로 이동
	}
	@GetMapping("/login") 
	public String login() {
		
		return "login";
	}

}
