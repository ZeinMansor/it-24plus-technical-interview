package com.it24plus.goelocation.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address_information")
public class AddressInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column
    public String title;

    @Column
    public String label;
    @Column(name = "country_code")
    public String countryCode;

    @Column(name = "country_name")
    public String countryName;
    @Column
    public String state;
    @Column(name = "county_code")
    public String countyCode;
    @Column
    public String county;
    @Column(name = "postal_code")
    public String postalCode;

    // latitude & longitude, can be used to show point on the map
    public float lat;
    public float lng;


}
