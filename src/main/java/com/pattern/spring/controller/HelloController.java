package com.pattern.spring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pattern.spring.domain.Message;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String init() {

		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping("/hello/{name}")
	public Message mensage(@PathVariable String name) {

		Message msg = new Message(name, "Hello " + name);

		return msg;
	}

}
