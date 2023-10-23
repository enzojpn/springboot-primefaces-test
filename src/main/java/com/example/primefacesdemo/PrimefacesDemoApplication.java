package com.example.primefacesdemo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.faces.webapp.FacesServlet;

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
