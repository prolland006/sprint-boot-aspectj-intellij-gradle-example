package com.testswing;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:default.properties")
public class SpringContext {

    @Value("${title}")
    String title;

    @Bean(name = "mainFrame")
    public MainFrame createMainFrame() {
        return new MainFrame(title);
    }

    @Bean(name = "metierProfiler")
    public MetierProfiler createMetierProfiler() {
        return new MetierProfiler();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer setUp() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}