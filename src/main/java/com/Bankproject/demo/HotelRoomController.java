package com.Bankproject.demo;

import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path ="hotelrooms")
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

    @RequestMapping(path = "/{fromDate}/{toDate}", method = RequestMethod.GET)
    public List<HotelRooms> availableRooms(@PathVariable LocalDate fromDate, @PathVariable LocalDate toDate){
      return   hotelRoomService.availableRooms(fromDate,toDate);
    }
    @RequestMapping(path="/isKing",method = RequestMethod.GET)
    public List<HotelRooms> isKing(){
        return hotelRoomService.roomIsKingBed();
    }

    @RequestMapping(path ="/checkout/{id}", method = RequestMethod.PUT)
    public void  checkout(@PathVariable int id){
         hotelRoomService.checkout(id);
    }

}
