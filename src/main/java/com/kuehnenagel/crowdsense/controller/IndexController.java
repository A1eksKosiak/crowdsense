package com.kuehnenagel.crowdsense.controller;

import com.kuehnenagel.crowdsense.dto.ApplicationDto;
import com.kuehnenagel.crowdsense.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class IndexController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping(path = "/", produces = "application/json")
    public List<ApplicationDto> getApplications() {
        return applicationService.getAll();
    }

}
