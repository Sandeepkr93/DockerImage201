package com.mindtree.mystay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.mystay.entity.Booking;
import com.mindtree.mystay.entity.Hotel;
import com.mindtree.mystay.entity.Room;
import com.mindtree.mystay.repository.BookingRepository;
import com.mindtree.mystay.repository.HotelRepository;
import com.mindtree.mystay.repository.RoomRepository;
import com.mindtree.mystay.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	HotelRepository hotelRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	RoomRepository roomRepository;

	@Override
	public String doBooking(Booking booking, String hotel, String roomType) {
		// TODO Auto-generated method stub
		Hotel hhotel = hotelRepository.findByHotelName(hotel);
		int hotelId = hhotel.getHotelId();

		List<Room> rooms = hhotel.getRooms();
		for (Room room : rooms) {
			if (room.getRoomType().equals(roomType)) {
				booking.setRoom(room);

			}
		}

		bookingRepository.save(booking);
		return "booking done";
	}

}
