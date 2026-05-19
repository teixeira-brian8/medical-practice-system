package com.brianteixeira.clinic.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Appointment {
    private Patient patient;
    private List<String> professional = new ArrayList<>();
    private LocalDateTime appointmentDate;
    private Set<String> causes = new HashSet<>();

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public List<String> getProfessional() {
        return professional;
    }
    public void setProfessional(List<String> professional) {
        this.professional = professional;
    }
    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }
    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public Set<String> getCauses() {
        return causes;
    }
    public void setCauses(Set<String> causes) {
        this.causes = causes;
    }
    public Appointment(Patient patient, List<String> professional, LocalDateTime appointmentDate, Set<String> causes) {
        this.patient = patient;
        this.professional = professional;
        this.appointmentDate = appointmentDate;
        this.causes = causes;
    }
}