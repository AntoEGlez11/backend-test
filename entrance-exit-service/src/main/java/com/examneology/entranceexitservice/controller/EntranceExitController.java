package com.examneology.entranceexitservice.controller;

import com.examneology.entranceexitservice.model.EntranceExit;
import com.examneology.entranceexitservice.service.EntranceExitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/entrance-exit/")
@RequiredArgsConstructor
public class EntranceExitController {
    private final EntranceExitService entranceExitService;

    //salida regisstrada
    @PostMapping("/register-entrance")
    public EntranceExit registerEntrance(@RequestParam String licensePlate) {

        return entranceExitService.registerEntrance(licensePlate);
    }

    //salida registrada
    @PostMapping("/register-exit")
    public EntranceExit registerExit(@RequestParam String licensePlate) {
        return entranceExitService.registerExit(licensePlate);

    }



    //buscandi las licencias
    @GetMapping("/findByLicense")
    public List<EntranceExit> findByLicense(@RequestParam String licensePlate) {
        return entranceExitService.findByLicensePlate(licensePlate);

    }
}
