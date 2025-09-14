package com.theusazevedd.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.theusazevedd.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
