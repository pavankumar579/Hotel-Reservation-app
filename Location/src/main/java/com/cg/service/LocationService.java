package com.cg.service;

import java.util.List;

import com.cg.exception.LocationAlreadyExistedException;
import com.cg.model.Location;

public interface LocationService {
   	 public Location addLocation(Location loc) throws LocationAlreadyExistedException;
     public List<Location> getAllLocationName();
     public void deleteByPincode(int pc);
}
