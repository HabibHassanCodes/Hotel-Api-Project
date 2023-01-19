package com.Bankproject.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository){
      return args ->{
          Account habib =new Account("habib","hassan",2000.0,4000.0,"habibhassan@google.com");
			accountRepository.save(habib);
      };
    }
}
