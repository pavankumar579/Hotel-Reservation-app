package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.HotelAdmin;
import com.cg.repository.HotelAdminRepository;

@Service
public class HotelAdminServiceImp implements HotelAdminService {
	private HotelAdminRepository haRepo;
    @Autowired
	public HotelAdminServiceImp(HotelAdminRepository haRepo) {
		super();
		this.haRepo = haRepo;
	}
	@Override
	public List<HotelAdmin> getAllHnames() {
		return (List<HotelAdmin>)haRepo.findAll();
	}
	@Override
	public HotelAdmin addHnames(HotelAdmin hotel) {
		HotelAdmin savedHadmin=haRepo.save(hotel);
		return savedHadmin;
	}
	@Override
	public void deleteByHid(int hid) {
		haRepo.deleteById(hid);	
	}
}
