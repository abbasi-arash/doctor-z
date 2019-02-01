package com.firstsource.doctor.ws;

import com.firstsource.doctor.dto.request.DoctorRequest;
import com.firstsource.doctor.dto.response.DoctorResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "doctor", url = "http://localhost:8086")
public interface DoctorFeign {
    @PostMapping(value = "api/doctor/v1/doctors",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<DoctorResponse> findDoctors(@RequestBody DoctorRequest request);
}
