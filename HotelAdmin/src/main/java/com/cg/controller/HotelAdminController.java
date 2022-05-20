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

import com.cg.model.HotelAdmin;
import com.cg.service.HotelAdminService;

@RestController
@RequestMapping("/api/v1")
public class HotelAdminController {
     private HotelAdminService haServ;
    @Autowired
	public HotelAdminController(HotelAdminService haServ) {
		super();
		this.haServ = haServ;
	}
    @PostMapping("/")
    public ResponseEntity<HotelAdmin> addHnames(@RequestBody HotelAdmin hAdmin){
    	HotelAdmin saveHadmin=haServ.addHnames(hAdmin);
    	return new ResponseEntity<>(saveHadmin,HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<List<HotelAdmin>> getAllHnames(){
    	return new ResponseEntity<List<HotelAdmin>>((List<HotelAdmin>)haServ.getAllHnames(),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{hid}")
    public ResponseEntity<Void> deleteByHid(@PathVariable int hid){
    	haServ.deleteByHid(hid);
    	return ResponseEntity.noContent().build();
    }
    
}
