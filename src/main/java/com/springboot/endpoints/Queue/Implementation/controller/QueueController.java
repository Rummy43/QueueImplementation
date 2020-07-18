package com.springboot.endpoints.Queue.Implementation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QueueController {
	
	@GetMapping(value="/getMessage")
	public @ResponseBody String getMessage() {
		System.out.println("here in getMessage...");
		return "hello";
	}

}
