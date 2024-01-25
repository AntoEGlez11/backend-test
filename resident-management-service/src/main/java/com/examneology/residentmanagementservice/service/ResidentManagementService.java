package com.examneology.residentmanagementservice.service;

import com.examneology.residentmanagementservice.model.ResidentVehicle;
import com.examneology.residentmanagementservice.repository.ResidentVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public interface ResidentManagementService {

    ResidentVehicle addResidentVehicle(String licensePlate, String residentName);
    ResidentVehicle findResidentVehicleByLicensePlate(String licensePlate);
}
