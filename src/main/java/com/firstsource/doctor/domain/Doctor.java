package com.firstsource.doctor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "doctor")
@Data
public class Doctor {
    @Id
    private String id;
    private String name;
    @DBRef
    private List<Speciality> specialties;
    @DBRef
    private List<Appointment> appointments;

}
