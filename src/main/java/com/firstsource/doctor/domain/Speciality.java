package com.firstsource.doctor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "speciality")
@Data
public class Speciality {
    @Id
    private String id;
    private String title;
}
