package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.LocationAlreadyExistedException;
import com.cg.model.Location;
import com.cg.service.LocationService;

@RestController
@RequestMapping("/api/v1")
public class LocationController {
     private LocationService lServ;
     @Autowired
	public LocationController(LocationService lServ) {
		super();
		this.lServ = lServ;
	}
     @GetMapping("/getl")
     public ResponseEntity<List<Location>> getAllLocationName(){
     	return new ResponseEntity<List<Location>>((List<Location>)lServ.getAllLocationName
     			(),HttpStatus.ACCEPTED);
     }
     @DeleteMapping("/delloc/{pincode}")
     public ResponseEntity<Void> deleteByPincode(@PathVariable int pincode){
    	 lServ.deleteByPincode(pincode);
     	return ResponseEntity.noContent().build();
     }
     @PostMapping("/postl")
     public ResponseEntity<Location> addLocation(@RequestBody Location loc)throws LocationAlreadyExistedException{
       	Location savedLocation=lServ.addLocation(loc);
 	    return new ResponseEntity<>(savedLocation,HttpStatus.CREATED);
 }
}
