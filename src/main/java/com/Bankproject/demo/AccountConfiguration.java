package com.Bankproject.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository){
      return args ->{
          Account habib =new Account("Habib","Hassan",2000.0,4000.0,"habibhassan@gmail.com");
          Account bob =new Account("Bob","Jones",1000.0,3000.0,"bobjones@gmail.com");
          Account sam =new Account("Sam","Boots",1000.0,3000.0,"samboots@gmail.com");
              accountRepository.save(sam);
              accountRepository.save(habib);
              accountRepository.save(bob);
      };
    }
}
