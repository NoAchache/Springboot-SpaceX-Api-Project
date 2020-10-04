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
public class NextLaunchShipDetails {

    @JsonProperty("mission_name")
    private String missionName;

    @JsonProperty("mission_details")
    private String missionDetails;

    @JsonProperty("fairing_recovery_ships")
    private List<ShipDetailsDto> fairingRecoveryShips = Collections.emptyList();

    @JsonProperty("fairing_recovery_ships")
    private List<ShipDetailsDto> otherShips = Collections.emptyList();

}
