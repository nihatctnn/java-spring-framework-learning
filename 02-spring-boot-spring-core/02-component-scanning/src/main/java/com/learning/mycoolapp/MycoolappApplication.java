package com.learning.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//			scanBasePackages = {"com.learning.mycoolapp",
//								"com.learning.util"}
//)

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
