package com.flight.crawler.model.weather;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record WeatherInformation(
    int start,
    int end,
    @JsonIgnore int dt,
    Temperature main,
    Wind wind,
    Clouds clouds,
    Weather[] weather,
    Rain rain,
    Snow snow) {}
