package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-port")
public class TestController {
	
	@GetMapping("/8081")
	private String host8081() {
		return "host 8081";
	}
	
	@GetMapping("/8082")
	private String host8082() {
		return "host 8082";
	}
}
