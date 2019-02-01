package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Appointment;
import com.firstsource.doctor.domain.AppointmentStatus;
import com.firstsource.doctor.domain.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.ZonedDateTime;
import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    List<Appointment> findByClinicInAndStatusAndStartAfterAndEndBefore(List<Clinic> clinics, AppointmentStatus status, ZonedDateTime from, ZonedDateTime to);
}
