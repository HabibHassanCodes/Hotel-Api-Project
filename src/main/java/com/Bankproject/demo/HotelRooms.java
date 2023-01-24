package com.Bankproject.demo;

import jakarta.persistence.*;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.SEQUENCE;
@Entity(name="HotelRooms")
@Table(name="hotel_rooms")
public class HotelRooms {

        @Id
        @SequenceGenerator(
                name="hotelrooms_sequence",
                sequenceName = "hotelrooms_sequence",
                allocationSize = 1,
                initialValue = 0
        )
        @GeneratedValue(
                strategy = SEQUENCE,
                generator = "hotelrooms_sequence"
        )
        @Column(
                name="id",
                updatable = false
        )
        private long id;
        @Column(
                name="to_Date",
                nullable = false
        )
        private LocalDate toDate;
        @Column(
                name="from_Date",
                nullable = false
        )
        private LocalDate fromDate;
        @Column(
                name="price",
                nullable = false
        )
        private double price;
        @Column(
                name = "is_Empty",
                nullable = false
        )
        private Boolean isEmpty;
        public HotelRooms(){

        }


        public HotelRooms( LocalDate toDate, LocalDate fromDate, double price, Boolean isEmpty) {
                this.toDate = toDate;
                this.fromDate = fromDate;
                this.price = price;
                this.isEmpty = true;
        }

        public void setId(long id) {
                this.id = id;
        }

        public void setToDate(LocalDate toDate) {
                this.toDate = toDate;
        }

        public void setFromDate(LocalDate fromDate) {
                this.fromDate = fromDate;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void setEmpty(Boolean empty) {
                isEmpty = empty;
        }

        public long getId() {
                return id;
        }

        public LocalDate getToDate() {
                return toDate;
        }

        public LocalDate getFromDate() {
                return fromDate;
        }

        public double getPrice() {
                return price;
        }

        public Boolean getEmpty() {
                return isEmpty;
        }
}


