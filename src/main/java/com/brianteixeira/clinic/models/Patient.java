package com.brianteixeira.clinic.models;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
public class Patient extends Person {
    private String patientCode; // 7-digit code, unique for each patient. Generated automatically by the system.
    private String insurance;
    private Set<String> medicalHistory = new HashSet<>();
    private Set<String> allergies = new HashSet<>();
    private Set<String> currentMedications = new HashSet<>();
    private Set<String> doctors = new HashSet<>(); // List of doctors responsible for the patient, if applicable.
    private Set<LocalDate> appointmentDates = new HashSet<>(); // List of dates when the patient had appointments, if applicable.
    private boolean lgpdConsent; // Indicates whether the patient has given consent for the use of their data in accordance with the LGPD (Lei Geral de Proteção de Dados) regulations in Brazil.

    public String getPatientCode() {
        return patientCode;
    }
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }
    public String getInsurance() {
        return insurance;
    }
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
    public Set<String> getMedicalHistory() {
        return medicalHistory;
    }
    public void setMedicalHistory(Set<String> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    public Set<String> getAllergies() {
        return allergies;
    }
    public void setAllergies(Set<String> allergies) {
        this.allergies = allergies;
    }
    public Set<String> getCurrentMedications() {
        return currentMedications;
    }
    public void setCurrentMedications(Set<String> currentMedications) {
        this.currentMedications = currentMedications;
    }
    public Set<String> getDoctors() {
        return doctors;
    }
    public void setDoctors(Set<String> doctors) {
        this.doctors = doctors;
    }
    public Set<LocalDate> getAppointmentDates() {
        return appointmentDates;
    }
    public void setAppointmentDates(Set<LocalDate> appointmentDates) {
        this.appointmentDates = appointmentDates;
    }
    public boolean isLgpdConsent() {
        return lgpdConsent;
    }
    public void setLgpdConsent(boolean lgpdConsent) {
        this.lgpdConsent = lgpdConsent;
    }
    public Patient(String firstName, String lastName, String email, String phoneNumber, String cpf, String gender,
                   LocalDate birthdate, String cityOrigin, String countryOrigin, String userLogin, String passwordLogin,
                   String patientCode, Set<String> doctors, Set<LocalDate> appointmentDates) {
        super(firstName, lastName, email, phoneNumber, cpf, gender, birthdate, cityOrigin, countryOrigin, userLogin,
                passwordLogin);
        this.patientCode = patientCode;
        this.doctors = doctors;
        this.appointmentDates = appointmentDates;
        this.lgpdConsent = false; // Default value, can be updated later based on patient's consent.
    }
}
