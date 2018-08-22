package com.wis.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}
	@RequestMapping("/bye")
	public String bye() {
		return "Bye! Bye!";
	}
}