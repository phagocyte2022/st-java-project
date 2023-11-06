package edu.javacourse.ext.register.rest;

import edu.javacourse.ext.register.business.MarriageManager;
import edu.javacourse.ext.register.view.MarriageRequest;
import edu.javacourse.ext.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("controller")
public class MarriageController {

    private static final  Logger LOGGER = LoggerFactory.getLogger(MarriageController.class);

    @Autowired
    private MarriageManager marriageManager;

    public MarriageResponse findMarriageCertificate (MarriageRequest request){
        LOGGER.info("findMarriageCertificate called");


        return marriageManager.findMarriageCertificate(request);
    }
}
