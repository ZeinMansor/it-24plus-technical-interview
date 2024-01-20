package com.it24plus.goelocation.service;


import com.it24plus.goelocation.dto.AddressInfoResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class GetAddressInformation {

    private CachedInfoService cacheService;
    private GeoLocationApi geoLocationApi;

    public GetAddressInformation(CachedInfoService _cacheService, GeoLocationApi _geoLocationApi) {
        this.cacheService = _cacheService;
        this.geoLocationApi = _geoLocationApi;
    }
    public AddressInfoResponseDTO getAddressInformation() {

        return null;

    }


}
