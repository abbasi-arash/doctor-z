package com.firstsource.doctor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "patient")
@Data
public class Patient {
    @Id
    private String id;
    private String name;
    private String phone;
    @DBRef
    private List<Appointment> appointments;
}
