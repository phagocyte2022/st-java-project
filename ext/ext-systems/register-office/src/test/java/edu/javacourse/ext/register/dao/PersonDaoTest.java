package edu.javacourse.ext.register.dao;

import edu.javacourse.ext.register.domain.Person;
import edu.javacourse.ext.register.domain.PersonFemale;
import edu.javacourse.ext.register.domain.PersonMale;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {

    @Test
    public void findPersons() {
        PersonDao dao = new PersonDao();
        List<Person> persons = dao.findPersons();

        persons.forEach(p ->{
            System.out.println("Name: " + p.getFirstName());
            System.out.println("Class for sex: " + p.getClass().getName());
            System.out.println("Passports: " + p.getPassports().size());
            System.out.println("Birth certificates: " + p.getBirthCertificate());
//            if (p instanceof PersonMale) {
//                System.out.println("Birth cert.: " + ((PersonMale)p).getBirthCertificates().size());
//                System.out.println("Marriage cert.: " + ((PersonMale)p).getMarriageCertificates().size());
//            } else {
//                System.out.println("Birth cert.: " + ((PersonFemale)p).getBirthCertificates().size());
//                System.out.println("Marriage cert.: " + ((PersonFemale)p).getMarriageCertificates().size());
//            }

        });

    }
}