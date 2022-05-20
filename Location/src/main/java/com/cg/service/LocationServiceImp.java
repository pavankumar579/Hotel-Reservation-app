package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.LocationAlreadyExistedException;
import com.cg.model.Location;
import com.cg.repository.LocationRepository;
@Service
public class LocationServiceImp implements LocationService {
    private LocationRepository lrRepo;
    @Autowired
	public LocationServiceImp(LocationRepository lr) {
		super();
		this.lrRepo = lr;
	}

	@Override
	public Location addLocation(Location loc) throws LocationAlreadyExistedException {
		if(lrRepo.existsById(loc.getPincode())) {
			throw new LocationAlreadyExistedException();
		}
		Location savedLoc=lrRepo.save(loc);
		return savedLoc;
	}

	@Override
	public void deleteByPincode(int pc) {
		lrRepo.deleteById(pc);
	}

	@Override
	public List<Location> getAllLocationName() {
		 return (List<Location>) lrRepo.findAll();	
	}

}
