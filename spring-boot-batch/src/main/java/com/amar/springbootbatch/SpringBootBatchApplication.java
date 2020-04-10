package com.amar.springbootbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.amar.springbootbatch"})
public class SpringBootBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBatchApplication.class, args);
	}

}
