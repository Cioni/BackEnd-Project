package com.integration.IntegrationProject.dentist.controller;

import com.integration.IntegrationProject.dentist.entities.Dentist;
import com.integration.IntegrationProject.dentist.repository.DentistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/dentist")
public class DentistController {

    private final DentistRepository dentistRepository;

    private final Logger log = LoggerFactory.getLogger(DentistController.class);

    public DentistController(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @GetMapping
    public List<Dentist> findAll() { return dentistRepository.findAll();}

    @GetMapping("/{license}")
    public ResponseEntity<Dentist>findByLicense(@PathVariable Long license){
        Optional<Dentist> optDentist = dentistRepository.findById(license);
        return optDentist.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }




}
