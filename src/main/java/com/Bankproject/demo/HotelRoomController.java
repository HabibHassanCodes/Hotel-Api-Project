package com.Bankproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="hotels")
public class HotelRoomController {

    private final HotelRoomService hotelRoomService;
    @Autowired
    public HotelRoomController(HotelRoomService hotelRoomService) {
        this.hotelRoomService = hotelRoomService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<HotelRooms> allHotels(){
       return hotelRoomService.hotelRoomsList();
    }

}
