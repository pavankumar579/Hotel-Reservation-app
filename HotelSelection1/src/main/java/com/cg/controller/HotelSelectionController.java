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

import com.cg.exception.HotelAlreadyFoundException;
import com.cg.model.HotelSelection;
import com.cg.service.HotelSelectionService;

@RestController
@RequestMapping("/api/v1")
public class HotelSelectionController {
    private HotelSelectionService hsServ;
    @Autowired
	public HotelSelectionController(HotelSelectionService hsServ) {
		super();
		this.hsServ = hsServ;
	}
    @GetMapping("/geths")
    public ResponseEntity<List<HotelSelection>> getAllHnames(){
    	return new ResponseEntity<List<HotelSelection>>((List<HotelSelection>)hsServ.getAllHnames(),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete1/{hid}")
    public ResponseEntity<Void> deleteByHid(@PathVariable int hid){
    	 hsServ.deleteByHid(hid);
    	return ResponseEntity.noContent().build();
    }
    @PostMapping("/post")
    public ResponseEntity<HotelSelection> addHnames(@RequestBody HotelSelection hs) throws HotelAlreadyFoundException{
      	HotelSelection saveHselection=hsServ.addHotelName(hs);
	    return new ResponseEntity<>(saveHselection,HttpStatus.CREATED);
}
}
