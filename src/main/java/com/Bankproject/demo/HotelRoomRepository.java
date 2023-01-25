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
            value = "UPDATE hotel_rooms u SET u.from_date = null WHERE u.id = :id",
            nativeQuery = true)
    void checkoutFromDate(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(
            value = "UPDATE hotel_rooms u SET u.to_date = null WHERE u.id = :id",
            nativeQuery = true)
    void checkoutToDate(@Param("id") int id);

    @Transactional
    @Modifying
    @Query(
            value = "UPDATE hotel_rooms u SET u.from_date = :date WHERE u.id = :id",
            nativeQuery = true)
    void checkInFromDate(@Param("date") LocalDate date, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(
            value = "UPDATE hotel_rooms u SET u.to_date = :date WHERE u.id = :id",
            nativeQuery = true)
    void checkInToDate(@Param("date") LocalDate date, @Param("id") int id);
}


