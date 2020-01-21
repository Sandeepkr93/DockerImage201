package com.mindtree.mystay.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private Date bookingTime;
	private String userName;
	private String userEmail;

	@OneToOne(cascade = CascadeType.ALL)
	Room room;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingTime=" + bookingTime + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", room=" + room + "]";
	}

	public Booking(int bookingId, Date bookingTime, String userName, String userEmail, Room room) {
		super();
		this.bookingId = bookingId;
		this.bookingTime = bookingTime;
		this.userName = userName;
		this.userEmail = userEmail;
		this.room = room;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
