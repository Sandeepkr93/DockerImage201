package com.mindtree.mystay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.mystay.entity.Hotel;
import com.mindtree.mystay.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{


	Room findRoomByHotel(Hotel hhotel);

}
