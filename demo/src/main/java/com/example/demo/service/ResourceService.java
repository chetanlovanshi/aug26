package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Resource;

public interface ResourceService {

	
	public List<Resource> allResources();

	public List<Resource> findBySkills();
	
}
