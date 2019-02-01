package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
}
