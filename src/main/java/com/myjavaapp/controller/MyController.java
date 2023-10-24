package com.myjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/getsr")
	public String getValue() {
		return "Greetings :)  :)  :) Sastha Roopan";
	}

}
