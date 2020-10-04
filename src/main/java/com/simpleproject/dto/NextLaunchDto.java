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

    private String details;

    @JsonProperty("ships")
    private List<String> shipsIds = Collections.emptyList();

    private String name;

    @Data
    public static class Fairings {
        @JsonProperty("ships")
        private List<String> shipsIds = Collections.emptyList();
    }


}
