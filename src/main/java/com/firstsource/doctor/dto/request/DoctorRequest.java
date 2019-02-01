package com.firstsource.doctor.dto.request;

import lombok.Data;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@Data
public class DoctorRequest {
    private String locationId;
    private String speciality;
}
