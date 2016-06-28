package com.kreait.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DefaultRestTemplateConfiguration {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Setup a default restTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        // create httpMessageConverter with our custom objectMapper
        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        jackson2HttpMessageConverter.setObjectMapper(objectMapper);

        // instantiate restTemplate with custom httpMessageConverter
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(0, jackson2HttpMessageConverter);
        // add new Request factory to enable PATCH requests
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        return restTemplate;
    }
}

