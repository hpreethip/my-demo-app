package com.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@GetMapping("/")
	public String helloWorld()
	{
		return "Hello World!";
	}
	
	@GetMapping("/hello")
	public String helloName(@RequestParam("name") String name)
	{
		return "Hello " + name +"!";
	}
}