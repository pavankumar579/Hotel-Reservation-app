package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.HotelAlreadyFoundException;
import com.cg.model.HotelSelection;
import com.cg.repository.HotelSelectionRepository;
@Service
public class HotelSelectionServiceImp implements HotelSelectionService{
	private HotelSelectionRepository hsRepo;
    @Autowired
    public HotelSelectionServiceImp(HotelSelectionRepository hs) {
		super();
		this.hsRepo = hs;
	}
	@Override
	public HotelSelection addHotelName(HotelSelection hs) throws HotelAlreadyFoundException {
		if(hsRepo.existsById(hs.getHid())) {
			throw new HotelAlreadyFoundException();
		}
		HotelSelection savedHselection=hsRepo.save(hs);
		return savedHselection;
	}

	@Override
	public List<HotelSelection> getAllHnames() {
		return (List<HotelSelection>)hsRepo.findAll();
	}

	@Override
	public void deleteByHid(int hid) {
		hsRepo.deleteById(hid);
	}

}
