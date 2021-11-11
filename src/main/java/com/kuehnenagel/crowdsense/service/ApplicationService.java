package com.kuehnenagel.crowdsense.service;

import com.kuehnenagel.crowdsense.dto.ApplicationDto;
import com.kuehnenagel.crowdsense.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationService {

    @Autowired
    ApplicationRepository applicationRepository;

    public List<ApplicationDto> getAll() {
        return applicationRepository.findAll()
                .stream()
                .map(ApplicationDto::new)
                .collect(Collectors.toList());
    }
}
