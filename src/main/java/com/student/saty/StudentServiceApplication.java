package com.student.saty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentServiceApplication.class, args);
		System.out.println("hello student service....");
	}

}
