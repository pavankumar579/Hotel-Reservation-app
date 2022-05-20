package com.cg.service;

import java.util.List;

import com.cg.exception.HotelAlreadyFoundException;
import com.cg.model.HotelSelection;

public interface HotelSelectionService {
     public HotelSelection addHotelName(HotelSelection hs) throws HotelAlreadyFoundException;
     public List<HotelSelection> getAllHnames();
     public void deleteByHid(int hid);
}
