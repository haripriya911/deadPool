package com.example.deadPool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeadPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeadPoolApplication.class, args);
		System.out.println("deadpool is the best");
	}

}
