package com.example.demo.nirfuser;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnidataRepository extends MongoRepository <Unidata, String>{
	List<Unidata> findByEmail(String email);
	List<Unidata> deleteAllByEmail(String email);
}
