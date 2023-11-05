package edu.javacourse.ext.city.dao;

import edu.javacourse.ext.city.domain.PersonRequest;
import edu.javacourse.ext.city.domain.PersonResponse;
import edu.javacourse.ext.city.exception.PersonCheckException;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class PersonCheckDaoTest {

    @Test
    public void checkPerson() throws PersonCheckException {

        PersonRequest pr = new PersonRequest();
        pr.setSurName("Doe");
        pr.setGivenName("John");
        pr.setPatronymic("Jamesson");
        pr.setDateOfBirth(LocalDate.of(1995, 3, 18));
        pr.setStreetCode(1);
        pr.setBuilding("10");
        pr.setExtension("2");
        pr.setApartment("121");

        PersonCheckDao dao = new PersonCheckDao();
        dao.setConnectionBuilder(new DirectConnectionBuilder());
        PersonResponse ps = dao.checkPerson(pr);
        Assert.assertTrue(ps.isRegistered());
        Assert.assertFalse(ps.isTemporal());

    }

    @Test
    public void checkPerson2() throws PersonCheckException {
        PersonRequest pr = new PersonRequest();
        pr.setSurName("Doe");
        pr.setGivenName("Jane");
        pr.setPatronymic("Peterson");
        pr.setDateOfBirth(LocalDate.of(1997, 8, 21));
        pr.setStreetCode(1);
        pr.setBuilding("10");
        pr.setExtension("2");
        pr.setApartment("121");

        PersonCheckDao dao = new PersonCheckDao();
        dao.setConnectionBuilder(new DirectConnectionBuilder());
        PersonResponse ps = dao.checkPerson(pr);
        Assert.assertTrue(ps.isRegistered());
        Assert.assertFalse(ps.isTemporal());

    }
}