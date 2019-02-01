package com.firstsource.doctor.web.rest;

import com.firstsource.doctor.dto.request.DoctorRequest;
import com.firstsource.doctor.dto.response.DoctorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Arash Abbasi (arash1abbasi@gmail.com)
 */
@RestController
@RequestMapping("/api/doctor")
public class DoctorResource {

    @PostMapping("/v1/doctors")
    public ResponseEntity<List<DoctorResponse>> findDoctorsByLocationAndSpeciality(@RequestBody DoctorRequest request){
        List<DoctorResponse> response = new ArrayList<>();
        DoctorResponse doctorResponse = new DoctorResponse();
        doctorResponse.setDoctorAddress("NO1-naseri ave-azadi street");
        doctorResponse.setDoctorId("507f191e810c19729de860ea");
        doctorResponse.setDoctorName("Arash Abbasi");
        response.add(doctorResponse);
        DoctorResponse doctorResponse2 = new DoctorResponse();
        doctorResponse2.setDoctorAddress("Tehran Province, Tehran, Parcham St, Clinic pasture");
        doctorResponse2.setDoctorId("507f191e810c19729de860ea");
        doctorResponse2.setDoctorName("Arash Abbasi");
        response.add(doctorResponse2);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
