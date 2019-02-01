package com.firstsource.doctor.service;

import com.firstsource.doctor.domain.Region;
import com.firstsource.doctor.exception.CustomException;
import com.firstsource.doctor.exception.ErrorCode;
import com.firstsource.doctor.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public Region find(String id) {
        return regionRepository.findById(id).orElseThrow(() -> new CustomException(ErrorCode.REGION_NOT_FOUND));
    }

    public List<Region> findAll() {
        List<Region> regions = regionRepository.findAll();
        if (regions == null || regions.isEmpty()) {
            throw new CustomException(ErrorCode.REGION_NOT_FOUND);
        }
        return regions;
    }
}
