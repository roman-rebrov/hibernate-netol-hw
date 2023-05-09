package com.cities.hibernate.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain getFilter(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .and()
                .authorizeHttpRequests().requestMatchers("/persons/by-city").permitAll()
                .and()
                .authorizeHttpRequests().anyRequest().authenticated();

        return http.build();
    }

}
