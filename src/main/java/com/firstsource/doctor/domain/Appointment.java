package com.firstsource.doctor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Document(collection = "appointment")
@Data
public class Appointment {
    @Id
    private String id;
    private ZonedDateTime start;
    private ZonedDateTime end;
    private AppointmentStatus status;
    @DBRef
    private Doctor doctor;
    @DBRef
    private Patient patient;
    @DBRef
    private Clinic clinic;
}
