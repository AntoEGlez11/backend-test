package com.examneology.entranceexitservice.repository;

import com.examneology.entranceexitservice.model.EntranceExit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface EntranceExitRepository extends MongoRepository<EntranceExit, String> {
    List<EntranceExit> findByLicensePlate(String licensePlate);
    List<EntranceExit> findByExitTimeIsNull();

    List<EntranceExit> findByLicensePlateAndExitTimeIsNull(String licensePlate);
}
