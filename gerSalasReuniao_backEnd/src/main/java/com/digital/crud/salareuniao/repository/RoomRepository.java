package com.digital.crud.salareuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.crud.salareuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {


}
