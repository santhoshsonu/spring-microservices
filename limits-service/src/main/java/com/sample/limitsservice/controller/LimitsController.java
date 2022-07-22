package com.sample.limitsservice.controller;

import com.sample.limitsservice.model.Limits;
import com.sample.limitsservice.service.LimitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/limits")
public class LimitsController {

    @Autowired
    LimitsService limitsService;

    @GetMapping
    public Limits getLimits() {
        return limitsService.getLimits();
    }

}
