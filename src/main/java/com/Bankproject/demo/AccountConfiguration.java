package com.Bankproject.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
          HotelRooms room1 = new HotelRooms(null, null,100, false, false, true,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/3848c32b.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room2 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 13),LocalDate.of(2023, Month.DECEMBER, 13),100, false,false, true,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/3848c32b.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room3 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 14),LocalDate.of(2023, Month.DECEMBER, 19),110, true,true,false,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/a40def0e.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room4 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 14),LocalDate.of(2023, Month.DECEMBER, 17),110, true,true, false,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/a40def0e.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room5 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 15),LocalDate.of(2023, Month.DECEMBER, 19),150, false, false,true,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/3848c32b.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room6 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 15),LocalDate.of(2023, Month.DECEMBER, 17),160, true,true,false,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/a40def0e.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room7 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 30),LocalDate.of(2023, Month.DECEMBER, 31),160, true,true,false,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/a40def0e.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");
          HotelRooms room8 = new HotelRooms(LocalDate.of(2023, Month.DECEMBER, 29),LocalDate.of(2023, Month.DECEMBER, 30),160, true,true,true,"https://images.trvl-media.com/hotels/3000000/2650000/2645800/2645725/3848c32b.jpg?impolicy=fcrop&w=1200&h=800&p=1&q=medium");

          hotelRoomRepository.saveAll(List.of(room1,room2,room3,room4,room5,room6, room7, room8));

      };
    }
}
