package com.Bankproject.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class AccountConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository, HotelRoomRepository hotelRoomRepository){
      return args ->{
          Account habib =new Account("Habib","Hassan",2000.0,4000.0,"habibhassan@gmail.com");
          Account bob =new Account("Bob","Jones",1000.0,3000.0,"bobjones@gmail.com");
          Account sam =new Account("Sam","Boots",1000.0,3000.0,"samboots@gmail.com");
              accountRepository.save(sam);
              accountRepository.save(habib);
              accountRepository.save(bob);
          HotelRooms room = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 12), LocalDate.of(2023, Month.DECEMBER, 13),100, true);
                hotelRoomRepository.save(room);

      };
    }
}
