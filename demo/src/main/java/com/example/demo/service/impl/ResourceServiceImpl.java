package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Resource;
import com.example.demo.repos.ResourceRepo;
import com.example.demo.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService{

	@Autowired
	ResourceRepo resourceRepo;
	
	
	@Override
	public List<Resource> allResources() {

		List<Resource>resources = new ArrayList<>();    
		resourceRepo.findAll().forEach(resources::add);    
		return resources;
	}


	@Override
	public List<Resource> findBySkills() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
