package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Region;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RegionRepository extends MongoRepository<Region, String> {
    Optional<Region> findById(String id);
}
