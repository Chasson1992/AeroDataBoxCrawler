package com.flight.crawler.model.weather;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Rain(@JsonAlias("1h") float oneHour, @JsonAlias("3h") float threeHour) {}
