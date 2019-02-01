package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicRepository extends MongoRepository<Clinic, String> {
}
