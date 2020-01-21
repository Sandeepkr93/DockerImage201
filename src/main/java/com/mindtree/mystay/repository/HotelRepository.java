package com.mindtree.mystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.mystay.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{

	Hotel findByHotelName(String hotel);

}
