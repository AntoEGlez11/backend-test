package com.examneology.entranceexitservice.service;


import com.examneology.entranceexitservice.model.EntranceExit;
import com.examneology.entranceexitservice.repository.EntranceExitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EntranceExitService {

    private final EntranceExitRepository entranceExitRepository;

    //Registro la entrada

    public EntranceExit registerEntrance(String licensePlate) {
        EntranceExit entranceExit = new EntranceExit();
        entranceExit.setLicensePlate(licensePlate);
        entranceExit.setEntranceTime(new Date());
        return entranceExitRepository.save(entranceExit);
    }

    //registr salida
    public EntranceExit registerExit(String licensePlate) {
        List<EntranceExit> entranceExits = entranceExitRepository.findByLicensePlateAndExitTimeIsNull(licensePlate);

        if (!entranceExits.isEmpty()) {
            EntranceExit entranceExit = entranceExits.get(0);
            entranceExit.setExitTime(new Date());
            entranceExitRepository.save(entranceExit);
            return entranceExit;
        }

        return null; // ??
    }

    //buscarpor licencia
    public List<EntranceExit> findByLicensePlate(String licensePlate) {
        return entranceExitRepository.findByLicensePlate(licensePlate);
    }

}
