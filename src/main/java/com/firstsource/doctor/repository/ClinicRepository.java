package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Clinic;
import com.firstsource.doctor.domain.Region;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ClinicRepository extends MongoRepository<Clinic, String> {
    Optional<Clinic> findById(String id);
    List<Clinic> findByRegionIn(List<Region> regions);
    List<Clinic> findByRegion(Region region);
}
