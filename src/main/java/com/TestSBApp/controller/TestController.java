package com.TestSBApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "This App is being deployed to the docker";
	}

}
