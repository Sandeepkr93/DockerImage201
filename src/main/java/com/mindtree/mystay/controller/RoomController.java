package com.mindtree.mystay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mindtree.mystay.service.BookingService;
import com.mindtree.mystay.service.HotelService;
import com.mindtree.mystay.service.RoomService;

@Controller
public class RoomController {
	
	@Autowired
	BookingService bookingService;

	@Autowired
	HotelService hotelService;

	@Autowired
	RoomService roomService;
	

}
