package com.examneology.residentmanagementservice.controller;

import com.examneology.residentmanagementservice.model.ResidentVehicle;
import com.examneology.residentmanagementservice.service.ResidentManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/resident-management")
@RequiredArgsConstructor
public class ResidentManagementController {
    private final ResidentManagementService residentManagementService;

    @PostMapping("/add-resident-vehicle")
    public ResponseEntity<ResidentVehicle> addResidentVehicle(@RequestParam String licensePlate, @RequestParam String residentName) {
        ResidentVehicle residentVehicle = residentManagementService.addResidentVehicle(licensePlate, residentName);
        return ResponseEntity.ok(residentVehicle);
    }

    @GetMapping("/find-resident-vehicle")
    public ResponseEntity<ResidentVehicle> findResidentVehicleByLicensePlate(@RequestParam String licensePlate) {
        ResidentVehicle residentVehicle = residentManagementService.findResidentVehicleByLicensePlate(licensePlate);
        return ResponseEntity.ok(residentVehicle);
    }
}
