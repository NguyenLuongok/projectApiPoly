package com.poly.api.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tong Duy Hai on 05/24/2020.
 * @created 24/05/2020
 * @project PolyProjectApi
 */
@Configuration
public class WebMvcConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
