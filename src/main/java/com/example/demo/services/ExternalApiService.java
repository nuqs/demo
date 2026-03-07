package com.example.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ExternalApiService {

    private final RestTemplate restTemplate;

    public Object getExternalData() {

        String url =
                "https://dummyjson.com/products/1";

        return restTemplate.getForObject(url, Object.class);
    }
}
