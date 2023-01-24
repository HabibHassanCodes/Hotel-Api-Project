package com.Bankproject.demo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Month;

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
                nullable = true
        )
        private LocalDate toDate;
        @Column(
                name="from_Date",
                nullable = true
        )
        private LocalDate fromDate;
        @Column(
                name="price",
                nullable = false
        )
        private double price;
        @Column(
                name = "is_Accessible",
                nullable = false
        )
        private boolean isAccessible;
        @Column(
                name = "is_King",
                nullable = false
        )
        private boolean isKing;
        @Column(
                name = "is_Two_Queens",
                nullable = false
        )
        private boolean isTwoQueens;
        @Column(
                name="image_url",
                nullable = false,
                columnDefinition = "TEXT"
        )
        private String imageUrl;
        public HotelRooms(){

        }


        public HotelRooms( LocalDate toDate, LocalDate fromDate, double price, boolean isAccessible, boolean isKing, boolean isTwoQueens, String imageUrl) {
                this.toDate = toDate;
                this.fromDate = fromDate;
                this.price = price;
                this.isAccessible = isAccessible;
                this.isKing = isKing;
                this.isTwoQueens = isTwoQueens;
                this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }

        public void setAccessible(boolean accessible) {
                isAccessible = accessible;
        }


        public boolean isAccessible() {
                return isAccessible;
        }



        public void setAccessible(Boolean accessible) {
                this.isAccessible = accessible;
        }

        public Boolean getAccessible() {
                return isAccessible;
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

        public boolean isKing() {
                return isKing;
        }

        public boolean isTwoQueens() {
                return isTwoQueens;
        }

        public void setKing(boolean king) {
                isKing = king;
        }

        public void setTwoQueens(boolean twoQueens) {
                isTwoQueens = twoQueens;
        }
}


