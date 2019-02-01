package com.firstsource.doctor.service;

import com.firstsource.doctor.domain.Speciality;
import com.firstsource.doctor.exception.CustomException;
import com.firstsource.doctor.exception.ErrorCode;
import com.firstsource.doctor.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SpecialityService {
    @Autowired
    private SpecialityRepository specialityRepository;

    public Speciality find(String id) {
        return specialityRepository.findById(id).orElseThrow(() -> new CustomException(ErrorCode.SPECIALITY_NOT_FOUND));
    }

    public List<Speciality> findAll() {
        List<Speciality> speciality = specialityRepository.findAll();
        if (speciality == null || speciality.isEmpty()) {
            throw new CustomException(ErrorCode.SPECIALITY_NOT_FOUND);
        }
        return speciality;
    }
}
