package com.spacex.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.AbstractList;
import java.util.ArrayList;
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

    @JsonProperty("other_ships")
    private List<ShipDetailsDto> otherShips = Collections.emptyList();


}
