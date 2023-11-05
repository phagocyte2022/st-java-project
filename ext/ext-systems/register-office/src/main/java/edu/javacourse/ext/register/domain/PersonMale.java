package edu.javacourse.ext.register.domain;

import java.util.List;

public class PersonMale extends Person{
    private List<MarriageCertificate> marriageCertificates;
    private List<BirthCertificate> birthCertificates;

    public List<BirthCertificate> getBirthCertificates() {
        return birthCertificates;
    }

    public void setBirthCertificates(List<BirthCertificate> birthCertificates) {
        this.birthCertificates = birthCertificates;
    }

    public List<MarriageCertificate> getMarriageCertificates() {
        return marriageCertificates;
    }

    public void setMarriageCertificates(List<MarriageCertificate> marriageCertificates) {
        this.marriageCertificates = marriageCertificates;
    }
}
