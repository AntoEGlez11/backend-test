package com.examneology.entranceexitservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "entranceExit")
public class EntranceExit {

    @Id
    private String id;

    private String licensePlate; //placavehiculo}

    private Date entranceTime; // hora de entrada
    private Date exitTime; //hora d salida
    private String vehicleType; // tipo de vehiculo



}
