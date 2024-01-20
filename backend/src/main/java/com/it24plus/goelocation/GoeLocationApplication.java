package com.it24plus.goelocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class GoeLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoeLocationApplication.class, args);
	}



}
