package com.scratch.spring.di.service;

/**
 * Service responsible for formatting text.
 */
public interface TextFormatter {

  /**
   * Formats the given text into lower-case. If text is null, then null is returned.
   *
   * @param text the text to format
   * @return the text in lower-case
   */
  String convertToLowerCase(String text);

  /**
   * Formats the given text into upper-case. If text is null, then null is returned.
   *
   * @param text the text to format
   * @return the text in upper-case
   */
  String convertToUpperCase(String text);

}
