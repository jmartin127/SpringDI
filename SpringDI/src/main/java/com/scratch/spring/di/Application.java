package com.scratch.spring.di;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.scratch.spring.di.service.SimpleLogger;

/**
 * Main application class for the project
 */
public class Application {

  private static Logger LOGGER = Logger.getLogger(Application.class);

  /**
   * The main method for launching the application.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    // initialize the context
    SpringApplication.run(AppConfig.class, args);
    final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    // run the application
    final String message = "Hello World!";
    LOGGER.info("Original message: " + message);
    final SimpleLogger simplePrinter = context.getBean(SimpleLogger.class);
    simplePrinter.logInLowerCase(message);
    simplePrinter.logInUpperCase(message);

    // close the context
    context.close();
  }

}
