package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Speciality;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpecialityRepository extends MongoRepository<Speciality, String> {
}
