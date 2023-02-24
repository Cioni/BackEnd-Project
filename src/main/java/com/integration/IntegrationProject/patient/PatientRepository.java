package com.integration.IntegrationProject.patient;


import com.integration.IntegrationProject.patient.entities.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
