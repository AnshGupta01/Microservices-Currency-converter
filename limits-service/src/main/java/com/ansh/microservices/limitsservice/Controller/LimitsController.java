package com.ansh.microservices.limitsservice.Controller;

import com.ansh.microservices.limitsservice.Configuration.Config;
import com.ansh.microservices.limitsservice.bean.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Config config;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(config.getMinimum(), config.getMaximum());
    }
}
