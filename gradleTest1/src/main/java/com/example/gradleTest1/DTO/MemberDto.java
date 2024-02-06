package com.example.gradleTest1.DTO;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MemberDto {
	
	@Email
	private String email;
	
	@NotNull(message="name is not input")
	private String name;
	
	@NotBlank
	@Size(min = 6, message="최소 6자리 이상")
	@Size(max = 12, message="최대 12자리")
	private String password;
	
	@NotEmpty(message="city is required")
	private String city;
	
	
	private String state;
	
	@Digits(integer=5, fraction=0, message="우편번호 자릿수가 올바르않습다.")
	private String zipCode;
}

/*
	@NotNull - null불가
	@Null - null값만 허용
	@NotEmpty - null, 빈문자열 불가
	@NotBlack - null, 빈문자열, 스페이스공간 불가
	@Size(min, max) - 문자열, 배열의 크기가 만족한가?
	@Pattern(regex=) - 정규식 만족?
	@Max(숫자) - 지정값 이하?
	@Min(숫자) - 지정값 이상?
	@Email - 이메일 형식인가?
	@Digits(integer, fraction) - 지정된 정수와 소수자리 만족?
	@Future - 지금 보다 앞일인가? 미래
	@Past - 지금보다 과거인가? 과거



*/
