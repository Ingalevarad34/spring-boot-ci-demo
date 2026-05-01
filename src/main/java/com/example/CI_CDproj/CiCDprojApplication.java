package com.example.CI_CDproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiCDprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCDprojApplication.class, args);
		System.out.println("ci/cd started");
	}

}
