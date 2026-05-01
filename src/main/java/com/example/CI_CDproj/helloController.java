package com.example.CI_CDproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@GetMapping("/")
	public String hello() {
		return "Hello from Ci/Cd pipelines...";
	}
}
