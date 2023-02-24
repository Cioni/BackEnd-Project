package com.integration.IntegrationProject.dentist.entities;

import com.integration.IntegrationProject.dentist.repository.DentistRepository;

public class Dentist {

    private Long license;

    private String name;

    private String lastName;


    public Dentist(String name, String lastName, Long license){
        this.name = name;
        this.lastName = lastName;
        this.license  = license;
    }

    public Dentist(){};

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() { return lastName;}

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Long getLicense() { return license;}

    public void setLicense(Long license){
        this.license = license;
    }

    @Override
    public String toString() {
        return "Dentist{" +
                "license=" + license +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
