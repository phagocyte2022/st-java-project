package edu.javacourse.ext.register.business;

import edu.javacourse.ext.register.dao.MarriageDao;
import edu.javacourse.ext.register.dao.PersonDao;
import edu.javacourse.ext.register.domain.MarriageCertificate;
import edu.javacourse.ext.register.domain.Person;
import edu.javacourse.ext.register.domain.PersonFemale;
import edu.javacourse.ext.register.domain.PersonMale;
import edu.javacourse.ext.register.view.MarriageRequest;
import edu.javacourse.ext.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service("marriageService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao marriageDao;
    @Autowired
    private PersonDao personDao;

    @Transactional()
    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");

//        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);

        personDao.addPerson(getPerson(1));
        personDao.addPerson(getPerson(2));

        MarriageCertificate mc = getMarriageCertificate();
        marriageDao.saveAndFlush(mc);
//        marriageDao.findAll();
//        marriageDao.findById(1L);

        List<MarriageCertificate> list1 = marriageDao.findByNumber("12345");
        list1.forEach(m-> LOGGER.info("MC:{}", m.getMarriageCertificateId()));

        LOGGER.info("-----------------------------");
        List<MarriageCertificate> list2 = marriageDao.findByNum("98765");
        list2.forEach(m-> LOGGER.info("MC:{}", m.getMarriageCertificateId()));

        LOGGER.info("-----------------------------");
        List<MarriageCertificate> list3 = marriageDao.findSomething("01928");
        list3.forEach(m-> LOGGER.info("MC:{}", m.getMarriageCertificateId()));



        return new MarriageResponse();
    }

    private MarriageCertificate getMarriageCertificate(){
        MarriageCertificate mc = new MarriageCertificate();
        mc.setIssueDate(LocalDate.now());
        mc.setNumber("01928");
        mc.setActive(true);

        List<Person> persons = personDao.findPersons();
        for (Person person : persons) {
            if (person instanceof PersonMale){
                mc.setHusband((PersonMale) person);
            } else {
                mc.setWife((PersonFemale) person);
            }
        }

        return mc;


    }

    private static Person getPerson(int sex) {
        Person m = sex == 1 ? new PersonMale() : new PersonFemale();
        m.setFirstName("1_" + sex);
        m.setLastName("2_" + sex);
        m.setPatronymic("3_" + sex);
        m.setDateOfBirth(LocalDate.of(1991, 3, 12));
        return m;
    }
}
