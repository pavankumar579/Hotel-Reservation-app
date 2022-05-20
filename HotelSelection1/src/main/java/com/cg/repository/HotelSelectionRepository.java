package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.HotelSelection;

public interface HotelSelectionRepository extends MongoRepository<HotelSelection, Integer> {

}
