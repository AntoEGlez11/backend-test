package com.examneology.entranceexitservice.service;

import com.examneology.entranceexitservice.model.EntranceExit;
import com.examneology.entranceexitservice.repository.EntranceExitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EntranceExitServiceImpl extends EntranceExitService {

    private final EntranceExitRepository entranceExitRepository;

    public EntranceExitServiceImpl(EntranceExitRepository entranceExitRepository, EntranceExitRepository entranceExitRepository1) {
        super(entranceExitRepository);
        this.entranceExitRepository = entranceExitRepository1;
    }

    @Override
    public EntranceExit registerEntrance(String licensePlate) {
        EntranceExit entranceExit = new EntranceExit();
        entranceExit.setLicensePlate(licensePlate);
        entranceExit.setEntranceTime(new Date());
        return entranceExitRepository.save(entranceExit);
    }

    @Override
    public EntranceExit registerExit(String licensePlate) {
        List<EntranceExit> entranceExits = entranceExitRepository.findByLicensePlateAndExitTimeIsNull(licensePlate);

        if (!entranceExits.isEmpty()) {
            EntranceExit entranceExit = entranceExits.get(0);
            entranceExit.setExitTime(new Date());
            // Realizar otras acciones según sea necesario
            entranceExitRepository.save(entranceExit);
            return entranceExit;
        }

        return null;
    }

    @Override
    public List<EntranceExit> findByLicensePlate(String licensePlate) {
        return entranceExitRepository.findByLicensePlate(licensePlate);
    }
}
