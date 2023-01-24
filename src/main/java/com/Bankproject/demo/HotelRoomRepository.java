package com.Bankproject.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface HotelRoomRepository extends JpaRepository<HotelRooms, Long> {
    @Query(
            value = "SELECT * FROM hotel_rooms u WHERE u.is_king = true",
            nativeQuery = true)
    List<HotelRooms> isKing();

}
