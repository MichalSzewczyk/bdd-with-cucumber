package com.zoo.di;

import com.zoo.ducks.ports.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdaptersConfiguration {
    @Bean
    Output output() {
        return System.out::println;
    }
}