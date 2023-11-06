package edu.javacourse.ext.register.business;

import edu.javacourse.ext.register.dao.MarriageDao;
import edu.javacourse.ext.register.dao.PersonDao;
import edu.javacourse.ext.register.domain.MarriageCertificate;
import edu.javacourse.ext.register.view.MarriageRequest;
import edu.javacourse.ext.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    private MarriageDao marriageDao;
//    @Autowired
    private PersonDao personDao;

//    @Autowired
    public MarriageManager(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Autowired
    public void setMarriageDao(MarriageDao marriageDao) {
        this.marriageDao = marriageDao;
    }

    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");

        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);

        return new MarriageResponse();
    }
}
