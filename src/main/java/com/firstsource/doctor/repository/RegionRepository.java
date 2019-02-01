package com.firstsource.doctor.repository;

import com.firstsource.doctor.domain.Region;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionRepository extends MongoRepository<Region, String> {
}
