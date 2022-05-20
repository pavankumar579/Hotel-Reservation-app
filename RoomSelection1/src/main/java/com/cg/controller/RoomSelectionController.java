package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.NoSuchExistsException;
import com.cg.exception.RoomAlreadyFilledException;
import com.cg.model.RoomSelection;
import com.cg.service.RoomSelectionService;

@RestController
@RequestMapping("/api/v1")
public class RoomSelectionController {
     private RoomSelectionService rsServ;
     @Autowired
	public RoomSelectionController(RoomSelectionService rsServ) {
		super();
		this.rsServ = rsServ;
	}
     @GetMapping("/getrs")
     public ResponseEntity<List<RoomSelection>> getAllHnames(){
     	return new ResponseEntity<List<RoomSelection>>((List<RoomSelection>)rsServ.getAllRoomNames(),HttpStatus.ACCEPTED);
     }
     @DeleteMapping("/del/{rno}")
     public ResponseEntity<Void> deleteByRno(@PathVariable int rno){
    	 rsServ.deleteByRoomId(rno);
     	return ResponseEntity.noContent().build();
     }
     @PostMapping("/postrs")
     public ResponseEntity<RoomSelection> addHnames(@RequestBody RoomSelection hs) throws RoomAlreadyFilledException{
       	RoomSelection saveRselection=rsServ.addNoOfRooms(hs);
 	    return new ResponseEntity<>(saveRselection,HttpStatus.CREATED);
     }
     @PutMapping("/room/{rno}")
 	public RoomSelection
 	updateRoomname(@RequestBody RoomSelection rs,@PathVariable("rno")int rno) throws NoSuchExistsException  {
 		return rsServ.updateRoomNames(rs, rno);
 	}
}
