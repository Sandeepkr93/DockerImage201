package com.mindtree.mystay.service;

import com.mindtree.mystay.entity.Booking;

public interface BookingService {

	String doBooking(Booking booking, String hotel, String roomType);

}
