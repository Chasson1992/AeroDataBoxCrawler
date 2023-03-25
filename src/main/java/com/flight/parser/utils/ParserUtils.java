package com.flight.parser.utils;

public class ParserUtils {

  public static String getMonth(String month) {
    return month.length() > 1 ? month : "0" + month;
  }

  public static String getHour(String hour, String previousTime) {
    hour = hour.length() > 1 ? hour + "00" : "0" + hour + "00";
    previousTime = previousTime.length() > 1 ? previousTime + "00" : "0" + previousTime + "00";

    if (hour.equals("0000") && previousTime.equals("2200")) {
      return "2400";
    } else {
      return hour;
    }
  }

  public static String getDay(String day) {
    return day.length() > 1 ? day : "0" + day;
  }
}
