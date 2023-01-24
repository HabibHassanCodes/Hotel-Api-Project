package com.Bankproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@SpringBootApplication
@EnableJpaRepositories
public class BankProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankProjectApplication.class, args);

	}

}
