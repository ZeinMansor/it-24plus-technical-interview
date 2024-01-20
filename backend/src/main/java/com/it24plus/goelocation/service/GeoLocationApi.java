package com.it24plus.goelocation.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.it24plus.goelocation.dto.AddressInfoResponseDTO;
import com.it24plus.goelocation.dto.GeoLocationAPIResponse;
import com.it24plus.goelocation.shared.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GeoLocationApi {

    @Autowired
    private ConfigProperties config;

    public List<AddressInfoResponseDTO>  getGeoLocationInformation(String query) throws Exception {

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "Mozilla/5.0");
        headers.set("Connection", "keep-alive");
        headers.set("Accept", "application/json");

        HttpEntity httpEntity = new HttpEntity(headers);
        RestTemplate client = new RestTemplate();

        String urlString = this.config.getConfigValue("here-platform-geocode-search-url");

        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(urlString)
                .queryParam("q", query)
                .queryParam("apiKey", this.config.getConfigValue("here-platform-app-key"));

        URI uri = uriBuilder.build(true).toUri();

        HttpEntity<GeoLocationAPIResponse> response = client.exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                GeoLocationAPIResponse.class
        );

        List<AddressInfoResponseDTO> responseDTO = response.getBody().items;
        return responseDTO;
    }



}
