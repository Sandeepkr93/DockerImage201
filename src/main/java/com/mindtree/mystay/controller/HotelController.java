package com.mindtree.mystay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.mystay.service.BookingService;
import com.mindtree.mystay.service.HotelService;
import com.mindtree.mystay.service.RoomService;

@Controller
public class HotelController {

	@Autowired
	BookingService bookingService;

	@Autowired
	HotelService hotelService;

	@Autowired
	RoomService roomService;

	@RequestMapping("/hotels")
	public String getHotels(ModelMap model) {
		List<String> hotelnames = hotelService.getHotels();
		model.put("hotels", hotelnames);
		return "home";
	}
}
