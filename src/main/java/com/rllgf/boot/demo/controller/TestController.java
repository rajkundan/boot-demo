package com.rllgf.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/message")
	public String testMsg() {
		return "testing ok raj haiiiiii-------------------";
	}
}
