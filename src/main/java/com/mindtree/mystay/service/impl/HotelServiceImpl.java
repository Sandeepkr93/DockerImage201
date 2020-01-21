package com.mindtree.mystay.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.mystay.entity.Hotel;
import com.mindtree.mystay.repository.BookingRepository;
import com.mindtree.mystay.repository.HotelRepository;
import com.mindtree.mystay.repository.RoomRepository;
import com.mindtree.mystay.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	RoomRepository roomRepository;
	@Override
	public List<String> getHotels() {
		// TODO Auto-generated method stub
		List<String> hotelsnames=new ArrayList<String>();
		List<Hotel> hotels=new ArrayList<Hotel>();
		hotels=hotelRepository.findAll();
		
		for (Hotel hotel : hotels) {
			String hotelName=hotel.getHotelName();
			hotelsnames.add(hotelName);
		}
		return hotelsnames;
	}

}
