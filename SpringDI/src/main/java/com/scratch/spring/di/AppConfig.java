package com.scratch.spring.di;

import javax.inject.Inject;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.scratch.spring.di.internal.service.SimpleLoggerImpl;
import com.scratch.spring.di.internal.service.TextFormatterImpl;
import com.scratch.spring.di.service.SimpleLogger;
import com.scratch.spring.di.service.TextFormatter;

@Configuration
//using component scan with an explicit package definition to avoid scanning everything unnecessarily
@ComponentScan("com.scratch.spring.di")
@EnableAutoConfiguration
public class AppConfig {

  @Bean
  @Scope("singleton")
  @Inject
  public SimpleLogger simplePrinter(TextFormatter textFormatter) {
    return new SimpleLoggerImpl(textFormatter);
  }

  @Bean
  @Scope("singleton")
  public TextFormatter textFormatter() {
    return new TextFormatterImpl();
  }

}
