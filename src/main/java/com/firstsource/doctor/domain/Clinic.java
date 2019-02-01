package com.firstsource.doctor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clinic")
@Data
public class Clinic {
    @Id
    private String id;
    private String address;
    private String phone;
}
