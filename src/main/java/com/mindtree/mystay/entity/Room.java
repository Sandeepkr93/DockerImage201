package com.mindtree.mystay.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	private String roomType;
	private double roomPrice;

	@ManyToOne(cascade = CascadeType.ALL)
	Hotel hotel;

	@OneToOne(cascade = CascadeType.ALL,mappedBy = "room")
	Booking booking;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", roomPrice=" + roomPrice + ", hotel=" + hotel
				+ ", booking=" + booking + "]";
	}

	public Room(int roomId, String roomType, double roomPrice, Hotel hotel, Booking booking) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.hotel = hotel;
		this.booking = booking;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
