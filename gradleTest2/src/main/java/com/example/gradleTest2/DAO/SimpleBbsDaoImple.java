package com.example.gradleTest2.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.gradleTest2.DTO.SimpleBbsDTO;

@Mapper
public interface SimpleBbsDaoImple {

	public List<SimpleBbsDTO> list();
	public int write(SimpleBbsDTO simpleBbsDto);
	public SimpleBbsDTO view(String id);
	public int update(SimpleBbsDTO simpleBbsDto);
	public int delete(String id);
}
