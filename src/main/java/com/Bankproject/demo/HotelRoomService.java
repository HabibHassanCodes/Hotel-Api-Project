package com.Bankproject.demo;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelRoomService {
    private final HotelRoomRepository hotelRoomRepository;

    public HotelRoomService(HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    List<HotelRooms> hotelRoomsList(){
        return hotelRoomRepository.findAll();
    }
    List<HotelRooms> availableRooms(LocalDate fromDate, LocalDate toDate){
        List<HotelRooms> rooms = new ArrayList<>();
        for(int i =0; i<hotelRoomsList().size();i++){
            if(hotelRoomsList().get(i).getToDate() ==null && hotelRoomsList().get(i).getFromDate() == null || hotelRoomsList().get(i).getFromDate().isAfter(fromDate) && hotelRoomsList().get(i).getToDate().isAfter(toDate) || hotelRoomsList().get(i).getFromDate().isBefore(fromDate) && hotelRoomsList().get(i).getToDate().isBefore(toDate)){
                rooms.add(hotelRoomsList().get(i));
            }
        }
        return rooms;
    }
    List<HotelRooms>  roomIsKingBed(){
        return hotelRoomRepository.isKing();
    }

    void checkout(int id){
        Date date = Date.valueOf(LocalDate.now());
        hotelRoomRepository.checkoutFromDate(id);
        hotelRoomRepository.checkoutToDate(id);
    }
    void checkIn(LocalDate date, int id){
        hotelRoomRepository.checkInFromDate(date,id);
        hotelRoomRepository.checkInToDate(date,id);
        System.out.println("Working");
    }

}
