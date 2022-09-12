package com.hertzbit.thirdpartyserver.service;

import com.hertzbit.thirdpartyserver.model.LookUpResponse;
import com.hertzbit.thirdpartyserver.model.OnPremRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ThirdPartyLookUpService {

    private static final Logger LOGGER = LogManager.getLogger(ThirdPartyLookUpService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${lookup.server.address}")
    private String lookupServerAddress;

    @Value("${lookup.server.port}")
    private String lookupServerPort;

    public LookUpResponse performLookUp (OnPremRequest onPremRequest) throws URISyntaxException {

        String url = lookupServerAddress + ":" + lookupServerPort + "/telesign/lookup";
        URI uri = new URI(url);
        String phoneNumber = onPremRequest.getPhoneNumber();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        httpHeaders.add("Accept", "application/json");
        HttpEntity<String> requestEntity = new HttpEntity<>(phoneNumber, httpHeaders);
        ResponseEntity<LookUpResponse> response = this.restTemplate.exchange(uri,
                HttpMethod.POST, requestEntity, LookUpResponse.class);
        LOGGER.info("Received Response from server : " + response);
        return response.getBody();
    }
}
