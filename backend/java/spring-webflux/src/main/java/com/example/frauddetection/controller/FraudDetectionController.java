package com.example.frauddetection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FraudDetectionController {

    @GetMapping("/detect")
    public Mono<String> detectFraud() {
        return Mono.just("Fraud detection logic");
    }
}