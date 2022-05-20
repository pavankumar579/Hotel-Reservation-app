package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.RoomSelection;

public interface RoomSelectionRepository extends MongoRepository<RoomSelection, Integer> {

}
