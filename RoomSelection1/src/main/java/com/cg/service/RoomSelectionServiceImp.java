package com.cg.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.NoSuchExistsException;
import com.cg.exception.RoomAlreadyFilledException;
import com.cg.model.RoomSelection;
import com.cg.repository.RoomSelectionRepository;

@Service
public class RoomSelectionServiceImp implements RoomSelectionService{
    private RoomSelectionRepository rsRepo;
    @Autowired
	public RoomSelectionServiceImp(RoomSelectionRepository rsRepo) {
		super();
		this.rsRepo = rsRepo;
	}

	@Override
	public RoomSelection addNoOfRooms(RoomSelection rs) throws RoomAlreadyFilledException {
		if(rsRepo.existsById(rs.getRno())) {
			throw new RoomAlreadyFilledException();
		}
		RoomSelection savedRselection=rsRepo.save(rs);
		return savedRselection;
	}

	@Override
	public List<RoomSelection> getAllRoomNames() {
		return (List<RoomSelection>)rsRepo.findAll();
	}

	@Override
	public void deleteByRoomId(int rno) {
		rsRepo.deleteById(rno);
	}

	@Override
	public RoomSelection updateRoomNames(RoomSelection rs, int rno) throws NoSuchExistsException {
		 Optional<RoomSelection> rsDB =this.rsRepo.findById(rs.getRno());
	        if(rsDB.isPresent()) {
	            RoomSelection rsUpdate = rsDB.get();
	        rsUpdate.setRno(rs.getRno());
	        rsUpdate.setRname(rs.getRname());
	        rsUpdate.setRtype(rs.getRtype());
	        rsUpdate.setRprice(rs.getRprice());
	        rsUpdate.setNoofrooms(rs.getNoofrooms());
	        rsRepo.save(rs);
	        return rs;
	    }
	     else
	     {
	        throw new NoSuchExistsException();
	     }
	    
	}

}
