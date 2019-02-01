package com.firstsource.doctor.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "region")
@Data
public class Region {
    @Id
    private String id;
    private String title;
}
