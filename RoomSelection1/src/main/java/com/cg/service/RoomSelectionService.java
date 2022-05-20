package com.cg.service;

import java.util.List;

import com.cg.exception.NoSuchExistsException;
import com.cg.exception.RoomAlreadyFilledException;
import com.cg.model.RoomSelection;

public interface RoomSelectionService {
     public RoomSelection addNoOfRooms(RoomSelection rs) throws RoomAlreadyFilledException;
     public List<RoomSelection> getAllRoomNames();
     public void deleteByRoomId(int rno);
     public RoomSelection updateRoomNames(RoomSelection rs,int rno) throws NoSuchExistsException;
}
