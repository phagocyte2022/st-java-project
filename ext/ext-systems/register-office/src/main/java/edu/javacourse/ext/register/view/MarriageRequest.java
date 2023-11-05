package edu.javacourse.ext.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable {
    private String husbandSurname;
    private String husbandGivenname;
    private String husbandPatronymic;
    private LocalDate husbandDateOfBirth;
    private String husbandPassportSeria;
    private String husbandPassportNumber;
    private LocalDate husbandPassportIssueDate;

    private String wifeSurname;
    private String wifeGivenname;
    private String wifePatronymic;
    private LocalDate wifeDateOfBirth;
    private String wifePassportSeria;
    private String wifePassportNumber;
    private LocalDate wifePassportIssueDate;

    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDate;


}
