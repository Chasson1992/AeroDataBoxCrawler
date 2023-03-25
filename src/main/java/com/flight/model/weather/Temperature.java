package com.flight.crawler.model.weather;

public record Temperature(
    float temp,
    float feels_like,
    int pressure,
    int humidity,
    float temp_min,
    float temp_max,
    int sea_level,
    int grnd_level) {}
