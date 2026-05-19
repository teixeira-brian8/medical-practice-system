package com.brianteixeira.clinic.models;

import java.util.Set;
import java.util.HashSet;
import java.time.LocalDate;
public class Employee extends Person {
    private boolean isActive;
    private double salary;
    private Set<String> functionInClinic = new HashSet<>(); // Health Professional (Doctor, Nurse, Biomedical Scientist + administrative position if applicable) or Administrative (Assistant, Manager, Submanager).

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Set<String> getFunctionInClinic() {
        return functionInClinic;
    }
    public void setFunctionInClinic(Set<String> functionInClinic) {
        this.functionInClinic = functionInClinic;
    }
    public Employee(String firstName, String lastName, String email, String phoneNumber, String cpf, String gender,
                    LocalDate birthdate, String cityOrigin, String countryOrigin, String userLogin, String passwordLogin,
                    boolean isActive, double salary, Set<String> functionInClinic) {
        super(firstName, lastName, email, phoneNumber, cpf, gender, birthdate, cityOrigin, countryOrigin, userLogin,
                passwordLogin);
        this.isActive = isActive;
        this.salary = salary;
        this.functionInClinic = functionInClinic;
    }
}
