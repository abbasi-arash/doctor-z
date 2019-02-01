package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
}
