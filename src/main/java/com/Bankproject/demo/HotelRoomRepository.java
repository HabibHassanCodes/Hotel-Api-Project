package com.Bankproject.demo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface HotelRoomRepository extends JpaRepository<HotelRooms, Long> {
    @Query(
            value = "SELECT * FROM hotel_rooms u WHERE u.is_king = true",
            nativeQuery = true)
    List<HotelRooms> isKing();
    @Transactional
    @Modifying
    @Query(
            value = "UPDATE hotel_rooms u SET u.from_date = null WHERE u.id = :date",
            nativeQuery = true)
    void deactivateUsersNotLoggedInSince(@Param("date") int date);}


