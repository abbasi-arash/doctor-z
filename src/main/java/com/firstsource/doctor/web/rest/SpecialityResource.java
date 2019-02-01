package com.firstsource.doctor.web.rest;

import com.firstsource.doctor.domain.Speciality;
import com.firstsource.doctor.dto.response.SpecialityResponse;
import com.firstsource.doctor.mapper.SpecialityToSpecialityResponseMapper;
import com.firstsource.doctor.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class SpecialityResource {

    @Autowired
    private SpecialityService specialityService;

    @Autowired
    private SpecialityToSpecialityResponseMapper mapper;

    @GetMapping("/v1/specialities")
    public ResponseEntity<List<SpecialityResponse>> findSpecialities(){
        List<Speciality> specialities = specialityService.findAll();
        return new ResponseEntity(mapper.to(specialities), HttpStatus.OK);
    }
}
