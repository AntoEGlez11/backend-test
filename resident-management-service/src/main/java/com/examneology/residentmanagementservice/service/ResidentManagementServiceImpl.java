package com.examneology.residentmanagementservice.service;

import com.examneology.residentmanagementservice.model.ResidentVehicle;
import com.examneology.residentmanagementservice.repository.ResidentVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResidentManagementServiceImpl implements ResidentManagementService {
    private final ResidentVehicleRepository residentVehicleRepository;

    @Override
    public ResidentVehicle addResidentVehicle(String licensePlate, String residentName) {
        ResidentVehicle residentVehicle = new ResidentVehicle();
        residentVehicle.setLicensePlate(licensePlate);
        residentVehicle.setResidentName(residentName);
        return residentVehicleRepository.save(residentVehicle);
    }

    @Override
    public ResidentVehicle findResidentVehicleByLicensePlate(String licensePlate) {
        return residentVehicleRepository.findByLicensePlate(licensePlate);
    }
}
