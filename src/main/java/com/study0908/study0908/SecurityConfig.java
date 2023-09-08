package com.study0908.study0908;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filetChain(HttpSecurity http, final AuthenticationConfiguration authenticationConfiguration)throws Exception{

        http
            .cors(c -> c.disable())
            .csrf(c -> c.disable())
            .authorizeHttpRequests( r -> r.anyRequest().permitAll());

        return http.build();
    }
}
