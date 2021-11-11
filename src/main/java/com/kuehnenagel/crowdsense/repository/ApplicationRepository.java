package com.kuehnenagel.crowdsense.repository;

import com.kuehnenagel.crowdsense.model.Application;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
    List<Application> findAll();
}
