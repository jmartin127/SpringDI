package com.scratch.spring.di.service;

/**
 * Service responsible for printing text to standard out.
 */
public interface SimpleLogger {

  /**
   * Logs the given text to log4j, in lower-case.
   */
  void logInLowerCase(String text);

  /**
   * Logs the given text to log4j, in upper-case.
   */
  void logInUpperCase(String text);

}
