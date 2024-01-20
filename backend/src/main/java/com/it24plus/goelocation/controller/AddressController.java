package com.it24plus.goelocation.controller;

import com.it24plus.goelocation.dto.AddressInfoRequestDTO;
import com.it24plus.goelocation.dto.AddressInfoResponseDTO;
import com.it24plus.goelocation.service.GeoLocationApi;
import com.it24plus.goelocation.shared.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class AddressController {

    @Autowired
    public GeoLocationApi geoLocationApi;

    @Autowired
    public ConfigProperties config;
    @PostMapping(value = "/get-address-information",
            produces = "application/json",
            consumes = "application/json")
    @ResponseBody
    public AddressInfoResponseDTO getAddressInformation(@RequestBody AddressInfoRequestDTO request) throws Exception {

         return this.geoLocationApi.getGeoLocationInformation(request.address).get(0);

    }
}
