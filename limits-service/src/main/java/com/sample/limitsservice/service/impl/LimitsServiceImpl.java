package com.sample.limitsservice.service.impl;

import com.sample.limitsservice.configuration.Configuration;
import com.sample.limitsservice.model.Limits;
import com.sample.limitsservice.service.LimitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LimitsServiceImpl implements LimitsService {

    @Autowired
    private Configuration configuration;

    @Override
    public Limits getLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}
