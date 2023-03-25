package com.flight.crawler.model.weather;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Snow(@JsonAlias("1h") float oneHour, @JsonAlias("3h") float threeHour) {}
