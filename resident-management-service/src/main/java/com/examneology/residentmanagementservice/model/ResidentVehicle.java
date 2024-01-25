package com.examneology.residentmanagementservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "residentVehicles")
public class ResidentVehicle {
    @Id
    private String id;

    private String licensePlate; //licencia
    private String residentName; // nombre

}
