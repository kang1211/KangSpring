package com.example.gradleTest1.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SimpleBbsDto {
	
	private int id;
	
	@NotBlank(message="작성자 이름을 적어주세요")
	private String writer;
	
	@NotBlank(message="제목을 입력하세요")
	private String title;
	
	@NotBlank(message="내용을 입력하세요")
	private String content;
}
