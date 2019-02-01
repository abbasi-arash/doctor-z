package com.firstsource.doctor.service;

import com.firstsource.doctor.domain.Clinic;
import com.firstsource.doctor.domain.Region;
import com.firstsource.doctor.exception.CustomException;
import com.firstsource.doctor.exception.ErrorCode;
import com.firstsource.doctor.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {
    @Autowired
    private ClinicRepository clinicRepository;

    public Clinic find(String id) {
        return clinicRepository.findById(id).orElseThrow(() -> new CustomException(ErrorCode.CLINIC_NOT_FOUND));
    }

    public List<Clinic> findAll() {
        List<Clinic> clinics = clinicRepository.findAll();
        if (clinics == null || clinics.isEmpty()) {
            throw new CustomException(ErrorCode.CLINIC_NOT_FOUND);
        }
        return clinics;
    }

    List<Clinic> findByRegionIn(List<Region> regions) {
        List<Clinic> clinics =  clinicRepository.findByRegionIn(regions);
        if (clinics == null || clinics.isEmpty()) {
            throw new CustomException(ErrorCode.CLINIC_NOT_FOUND);
        }
        return clinics;
    }

    List<Clinic> findByRegion(Region region) {
        List<Clinic> clinics = clinicRepository.findByRegion(region);
        if (clinics == null || clinics.isEmpty()) {
            throw new CustomException(ErrorCode.CLINIC_NOT_FOUND);
        }
        return clinics;
    }
}
