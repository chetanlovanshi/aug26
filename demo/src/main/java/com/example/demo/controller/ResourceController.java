package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Resource;
import com.example.demo.service.ResourceService;

@RequestMapping(value = "/resource", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class ResourceController {

	
	@Autowired
	ResourceService resourceService;
	
	@GetMapping(value = "/all")
	public List<Resource> allResources(){
		return resourceService.allResources();
	}

	@GetMapping(value = "/")
	public List<Resource> findBySkills(){
		return resourceService.findBySkills();
	}

	
	
}
