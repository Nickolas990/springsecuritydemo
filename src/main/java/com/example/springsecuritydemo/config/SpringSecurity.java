package com.example.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

/**
 * @author Nickolay Melnikov"
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfiguration {
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) ->  web.ignoring().antMat("/ignore1", "/ignore2");
    }

}
