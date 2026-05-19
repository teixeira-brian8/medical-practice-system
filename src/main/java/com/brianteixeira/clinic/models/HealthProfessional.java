package com.brianteixeira.clinic.models;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

public class HealthProfessional extends Employee {
    private String graduation; // Doctor, Nurse, Biomedical Scientist.
    private Set<String> credentials = new HashSet<>(); // CRM, COREN, CRB, CRBM, etc.
    private Set<String> postNominalTitles = new HashSet<>(); // MD, RN, PhD,etc.

    public String getGraduation() {
        return graduation;
    }
    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
    public Set<String> getCredentials() {
        return credentials;
    }
    public void setCredentials(Set<String> credentials) {
        this.credentials = credentials;
    }
    public Set<String> getPostNominalTitles() {
        return postNominalTitles;
    }
    public void setPostNominalTitles(Set<String> postNominalTitles) {
        this.postNominalTitles = postNominalTitles;
    }
    public HealthProfessional(String firstName, String lastName, String email, String phoneNumber, String cpf,
                              String gender, LocalDate birthdate, String cityOrigin, String countryOrigin, String userLogin,
                              String passwordLogin, boolean isActive, double salary, Set<String> functionInClinic, String graduation,
                              Set<String> credentials) {
        super(firstName, lastName, email, phoneNumber, cpf, gender, birthdate, cityOrigin, countryOrigin, userLogin,
                passwordLogin, isActive, salary, functionInClinic);
        this.graduation = graduation;
        this.credentials = credentials;
    }
}