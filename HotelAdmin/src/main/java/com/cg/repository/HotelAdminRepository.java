package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.HotelAdmin;

public interface HotelAdminRepository extends MongoRepository<HotelAdmin, Integer> {

}
