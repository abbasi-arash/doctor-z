package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Speciality;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SpecialityRepository extends MongoRepository<Speciality, String> {
    Optional<Speciality> findById(String id);
}
