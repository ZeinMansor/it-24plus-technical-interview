package com.it24plus.goelocation.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Position implements Serializable {
    public int lat;

    public int lng;

}
