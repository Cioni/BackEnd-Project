package com.integration.IntegrationProject.dentist.repository;

import com.integration.IntegrationProject.dentist.entities.Dentist;

import java.util.List;
import java.util.Optional;

public interface DentistRepository {
    List<Dentist> findAll();

    Optional<Dentist> findById(Long license);
}
