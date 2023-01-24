package com.Bankproject.demo;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.stereotype.Service;

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


}
