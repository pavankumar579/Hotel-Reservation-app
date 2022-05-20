package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Location;

public interface LocationRepository extends MongoRepository<Location, Integer> {

}
