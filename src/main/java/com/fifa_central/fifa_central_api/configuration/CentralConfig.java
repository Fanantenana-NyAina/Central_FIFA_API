package com.fifa_central.fifa_central_api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CentralConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
