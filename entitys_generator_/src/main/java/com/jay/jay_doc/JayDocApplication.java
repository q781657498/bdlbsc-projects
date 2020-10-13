package com.jay.jay_doc;

import com.jay.jay_doc.filter.FilterInterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Arrays;

@SpringBootApplication
public class JayDocApplication {

    public static void main(String[] args) {
        SpringApplication.run(JayDocApplication.class, args);
    }

    @Bean
    @SuppressWarnings("unchecked")
    public FilterRegistrationBean logFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterInterceptor());
        filterRegistrationBean.setName("logFilterRegistrationBean");
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }


}
