package com.example.primefacesdemo;

import java.util.Arrays;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@EnableAutoConfiguration
@ComponentScan({"com.example.primefacesdemo"})
@SpringBootApplication
public class PrimefacesDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PrimefacesDemoApplication.class, args);
    }
 

    @Bean
    public ServletRegistrationBean<?> facesServletRegistration() {
        ServletRegistrationBean<?> srb = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
        srb.setLoadOnStartup(1);
        return srb;
    }
}
