package com.my.likelion_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	//회원 상세정보 볼수있는 페이지
	@GetMapping("/detail-user")
	public String detailUser(
			@RequestParam (value="uid") String id,
			Model model
			) {
		//디비 에시 받아온 데이터
		String name="오다현";
		String nickname="dh1234";
			//이부분이 디비랑 연동
		model.addAttribute("name",name);
		model.addAttribute("nick",nickname);
		return "detail-user";
	}


	@GetMapping("/getUser/{a}/{pw}")
	@ResponseBody
	public String addUser(
			@PathVariable("a") int userIdx
			) {
			
			return "ok";
	}
	
	@GetMapping("/saveUser") //요청방식, 요청경로
	@ResponseBody
	public String saveUser( 	//개개인의 다른 정보들을 외부에 요구해서 받아옴
			@RequestParam (value="uid") String id, //이부분에 데이터베이스를 넣음(회원정보, 아이디, 닉네임 등)
			@RequestParam (value="upw") String pw
			) {
		
		
		System.out.println(id); //활용 가능 db에 들어가거나 정보담기 가능
		System.out.println(pw);
		return "ok";
	}
	
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "home";
	}
}
