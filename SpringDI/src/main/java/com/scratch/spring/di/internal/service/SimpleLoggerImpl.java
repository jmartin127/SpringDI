package com.scratch.spring.di.internal.service;

import org.apache.log4j.Logger;

import com.scratch.spring.di.service.SimpleLogger;
import com.scratch.spring.di.service.TextFormatter;

/**
 * Default implementation of {@link SimpleLogger}.
 */
public class SimpleLoggerImpl implements SimpleLogger {

  private static Logger LOGGER = Logger.getLogger(SimpleLoggerImpl.class);

  private TextFormatter textFormatter;

  /**
   * Using constructor-based injection here to make dependencies explicit.
   */
  public SimpleLoggerImpl(TextFormatter textFormatter) {
    this.textFormatter = textFormatter;
  }

  /*
   * (non-Javadoc)
   * @see com.scratch.spring.di.SimplePrinter#printInLowerCase(java.lang.String)
   */
  @Override
  public void logInLowerCase(final String text) {
    LOGGER.info(textFormatter.convertToLowerCase(text));
  }

  /*
   * (non-Javadoc)
   * @see com.scratch.spring.di.service.SimpleLogger#logInUpperCase(java.lang.String)
   */
  @Override
  public void logInUpperCase(String text) {
    LOGGER.info(textFormatter.convertToUpperCase(text));
  }

}
