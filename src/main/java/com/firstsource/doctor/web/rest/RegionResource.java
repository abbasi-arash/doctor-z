package com.firstsource.doctor.web.rest;

import com.firstsource.doctor.domain.Region;
import com.firstsource.doctor.dto.response.RegionResponse;
import com.firstsource.doctor.mapper.RegionToRegionResponseMapper;
import com.firstsource.doctor.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class RegionResource {

    @Autowired
    private RegionService regionService;

    @Autowired
    private RegionToRegionResponseMapper mapper;

    @GetMapping("/v1/regions")
    public ResponseEntity<List<RegionResponse>> findSpecialities(){
        List<Region> regions = regionService.findAll();
        return new ResponseEntity(mapper.to(regions), HttpStatus.OK);
    }
}
