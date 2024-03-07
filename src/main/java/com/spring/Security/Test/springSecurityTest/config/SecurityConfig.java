package com.spring.Security.Test.springSecurityTest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  //this configuration annotation for bean define its read by spring container//
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
            httpSecurity.csrf().disable()   //only allow for /home/public//
            .authorizeHttpRequests()
                    .requestMatchers("/home/public")
                    .permitAll()
                    .anyRequest()
                    .authenticated()
                    .and()
                    .formLogin();

                    return httpSecurity.build();

    }

}
