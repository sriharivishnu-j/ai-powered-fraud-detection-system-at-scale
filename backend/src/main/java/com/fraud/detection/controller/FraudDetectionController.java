package com.fraud.detection.controller;

import com.fraud.detection.service.FraudDetectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraudDetectionController {

    private final FraudDetectionService fraudDetectionService;

    public FraudDetectionController(FraudDetectionService fraudDetectionService) {
        this.fraudDetectionService = fraudDetectionService;
    }

    @GetMapping("/detect")
    public String detectFraud() {
        return fraudDetectionService.detectFraud();
    }
}