package com.scratch.spring.di.internal.service;

import com.scratch.spring.di.service.TextFormatter;

/**
 * Default implementation of {@link TextFormatter}.
 */
public class TextFormatterImpl implements TextFormatter {

  /*
   * (non-Javadoc)
   * @see com.scratch.spring.di.TextFormatter#convertToLowerCase(java.lang.String)
   */
  @Override
  public String convertToLowerCase(String text) {
    if (text == null) {
      return null;
    }

    return text.toLowerCase();
  }

  /*
   * (non-Javadoc)
   * @see com.scratch.spring.di.service.TextFormatter#convertToUpperCase(java.lang.String)
   */
  @Override
  public String convertToUpperCase(String text) {
    if (text == null) {
      return null;
    }

    return text.toUpperCase();
  }

}
