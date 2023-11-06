package edu.javacourse.ext.register.business;

import edu.javacourse.ext.register.dao.MarriageDao;
import edu.javacourse.ext.register.domain.MarriageCertificate;
import edu.javacourse.ext.register.view.MarriageRequest;
import edu.javacourse.ext.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarriageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageManager.class);

    private MarriageDao marriageDao;

    public void setMarriageDao(MarriageDao marriageDao) {
        this.marriageDao = marriageDao;
    }

    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");

        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);

        return new MarriageResponse();
    }
}
