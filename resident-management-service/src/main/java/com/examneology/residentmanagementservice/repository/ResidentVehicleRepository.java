package com.examneology.residentmanagementservice.repository;

import com.examneology.residentmanagementservice.model.ResidentVehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResidentVehicleRepository extends MongoRepository<ResidentVehicle, String> {
    ResidentVehicle findByLicensePlate(String licensePlate);
}
