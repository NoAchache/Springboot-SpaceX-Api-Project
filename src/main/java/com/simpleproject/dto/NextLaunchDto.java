package com.simpleproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextLaunchDto {
    private Fairings fairings = new Fairings();

    @JsonProperty("rocket")
    private String rocketId;

    private String details;

    @JsonProperty("ships")
    private List<String> shipsId = Collections.emptyList();

    @JsonProperty("capsules")
    private List<String> capsulesId = Collections.emptyList();

    @JsonProperty("payloads")
    private List<String> payloadsId = Collections.emptyList();

    @JsonProperty("launchpad")
    private String launchpadId;

    @JsonProperty("flight_number")
    private String flightNumber;

    private String id;

    @Data
    public static class Fairings {
        @JsonProperty("ships")
        private List<String> shipsId = Collections.emptyList();
    }


}