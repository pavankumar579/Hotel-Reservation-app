package com.cg.service;

import java.util.List;

import com.cg.model.HotelAdmin;

public interface HotelAdminService {
     public List<HotelAdmin> getAllHnames();
     public HotelAdmin addHnames(HotelAdmin hotel);
     public void deleteByHid(int hid);
}
