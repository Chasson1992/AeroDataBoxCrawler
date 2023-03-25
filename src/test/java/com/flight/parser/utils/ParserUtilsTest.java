package com.flight.crawler.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CrawlerUtilsTest {

  @Test
  void getMonth_withoutLeadingZero_formatWithZero() {
    assertEquals("08", CrawlerUtils.getMonth("8"));
  }

  @Test
  void getMonth_withLeadingZero_dontFormat() {
    assertEquals("11", CrawlerUtils.getMonth("11"));
  }

  @Test
  void getHour_withSingleDigit_formatTwoTrailingZerosAndOneLeadingZero() {
    assertEquals("0500", CrawlerUtils.getHour("5", "1200"));
  }

  @Test
  void getHour_withTwoDigits_formatTwoTrailingZeros() {
    assertEquals("1200", CrawlerUtils.getHour("12", "1111111"));
  }

  @Test
  void getHour_atEndOfTheDay_formatTo2400() {
    assertEquals("2400", CrawlerUtils.getHour("0", "22"));
  }

  @Test
  void getDay_withoutLeadingZero_formatWithZero() {
    assertEquals("08", CrawlerUtils.getDay("8"));
  }

  @Test
  void getDay_withLeadingZero_dontFormat() {
    assertEquals("28", CrawlerUtils.getDay("28"));
  }
}
