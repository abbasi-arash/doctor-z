package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
