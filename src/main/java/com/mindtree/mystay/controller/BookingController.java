package com.mindtree.mystay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.mystay.entity.Booking;
import com.mindtree.mystay.service.BookingService;
import com.mindtree.mystay.service.HotelService;
import com.mindtree.mystay.service.RoomService;

@Controller
public class BookingController {
	
	static String shotelName;
	static String sroomsType;
	
	@Autowired
	BookingService bookingService;

	@Autowired
	HotelService hotelService;

	@Autowired
	RoomService roomService;
	
	@RequestMapping("/book")
	public String booking(String hotel,String roomType,Model model)
	{
		
		shotelName=hotel;
		sroomsType=roomType;
		return"user";
	}
	
	@RequestMapping("/booking")
	public String show(Booking booking)
	{
		
		System.out.println(shotelName);
		System.out.println(sroomsType);
		System.out.println(booking);
		bookingService.doBooking(booking,shotelName,sroomsType); 
		return "user";
		
	}

}
