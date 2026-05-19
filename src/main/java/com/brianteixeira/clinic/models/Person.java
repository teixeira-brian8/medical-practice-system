package com.brianteixeira.clinic.models;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String cpf;
    private String gender;
    private LocalDate birthdate;
    private LocalDate deathdate;
    private String cityOrigin;
    private String countryOrigin;
    private String userLogin; // Gerenated automatically by the system, unique for each person. Format: surname + first letter of the name + _ + (if is patiente, then is ptt. If is doctor, then is md. If is nurse, then is rn. If is biomedical scientist, then is bs/ms/phd. If is manager/submanager/administrative assistant, then is adm. Example: kingc_md - Charlotte King, MD.
    private String passwordLogin; // Generated automatically by the system, unique for each person. Format: first letter of the name + surname + 5-digit random number + special character. Example: cking12345*

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public LocalDate getDeathdate() {
        return deathdate;
    }
    public void setDeathdate(LocalDate deathdate) {
        this.deathdate = deathdate;
    }
    public String getCityOrigin() {
        return cityOrigin;
    }
    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }
    public String getCountryOrigin() {
        return countryOrigin;
    }
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
    public String getUserLogin() {
        return userLogin;
    }
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
    public String getPasswordLogin() {
        return passwordLogin;
    }
    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }
    public Person(String firstName, String lastName, String email, String phoneNumber, String cpf, String gender,
                  LocalDate birthdate, String cityOrigin, String countryOrigin, String userLogin, String passwordLogin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cpf = cpf;
        this.gender = gender;
        this.birthdate = birthdate;
        this.cityOrigin = cityOrigin;
        this.countryOrigin = countryOrigin;
        this.userLogin = userLogin;
        this.passwordLogin = passwordLogin;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Otimização: se for o exato mesmo objeto na memória, é igual.
        if (this == obj) return true;

        // 2. Proteção contra nulos
        if (obj == null) return false;

        // 3. Verificação Polimórfica (Garante que só compara Pessoas com Pessoas)
        if (!(obj instanceof Person)) return false;

        // 4. Downcasting
        Person other = (Person) obj;

        // 5. Comparação pelo identificador único natural (CPF)
        if (this.cpf == null) {
            return other.cpf == null;
        }

        return this.cpf.equals(other.cpf);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        // Gera a gaveta de memória baseada no CPF
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }
}