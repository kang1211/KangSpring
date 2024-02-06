package com.example.gradleTest1.control;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gradleTest1.DTO.MemberDto;

@Controller
public class ValidationController {

	// 유효성 검사 2 - form 입력 양식 페이지
	@GetMapping("/valid2")
	public String input(Model model) {
		model.addAttribute("memberDto", new MemberDto());
		return "signup";
	}
	
	@GetMapping("/submit")
	public String submit(@Valid MemberDto memberDto, Model model,
			BindingResult bind) {
		String page = "signupResult";// 문제 없으면 이동시킬 페이지
		
		if(bind.hasErrors()) {//writer, 또는 content 값을 입력하지 않은 경우 error값 있음
			page="signup"; // 오류가 생기면 page를 "signup"으로 내용을 갱신한다
		}
		
		return page;
	}
	
}
