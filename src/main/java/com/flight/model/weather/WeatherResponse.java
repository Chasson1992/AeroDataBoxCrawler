package com.flight.crawler.model.weather;

public record WeatherResponse(
    String message, String cod, int city_id, int calctime, int cnt, WeatherInformation[] list) {}
