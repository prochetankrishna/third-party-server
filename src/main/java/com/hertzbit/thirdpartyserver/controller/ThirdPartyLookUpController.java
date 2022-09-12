package com.hertzbit.thirdpartyserver.controller;

import com.hertzbit.thirdpartyserver.model.LookUpResponse;
import com.hertzbit.thirdpartyserver.model.OnPremRequest;
import com.hertzbit.thirdpartyserver.service.ThirdPartyLookUpService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class ThirdPartyLookUpController {

    private static final Logger LOGGER = LogManager.getLogger(ThirdPartyLookUpController.class);
    @Autowired
    private ThirdPartyLookUpService thirdPartyLookUpService;

    @PostMapping("/internal/lookup")
    public ResponseEntity<?> performLookUp(@RequestBody OnPremRequest onPremRequest) throws URISyntaxException {
        LOGGER.info("Request Received for : " + onPremRequest.getPhoneNumber());
        LookUpResponse lookUpResponse = this.thirdPartyLookUpService.
                performLookUp(onPremRequest);
        return new ResponseEntity<>(lookUpResponse, HttpStatus.OK);
    }
}
