package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Resource;

public interface ResourceRepo extends JpaRepository<Resource, Long> {

	
	
}
