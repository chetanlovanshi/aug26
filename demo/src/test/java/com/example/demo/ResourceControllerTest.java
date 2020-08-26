package com.example.demo;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.controller.ResourceController;
import com.example.demo.entity.Resource;
import com.example.demo.service.ResourceService;


	@RunWith(PowerMockRunner.class)
	@WebAppConfiguration

	public class ResourceControllerTest {

		
		@InjectMocks
		private ResourceController resourceController;
		
		
		@Mock
		ResourceService resourceService;
				
		
		@Before
	    public void init() throws UnsupportedEncodingException {
	        MockitoAnnotations.initMocks(this);
	    }

		@Test
		public void testGetAll() {

			List<Resource> resources=new ArrayList<Resource>();
			when(resourceService.allResources()).thenReturn(resources);
			List<Resource> actualResources=resourceController.allResources();
			assertEquals(resources, actualResources);
		}
}
