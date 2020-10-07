package com.spacex.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextLaunchShipDetailsDto {
  @JsonProperty("mission_name")
  private String missionName;

  @JsonProperty("mission_details")
  private String missionDetails;

  @JsonProperty("fairing_recovery_ships")
  private List<ShipDetailsDto> fairingRecoveryShips = Collections.emptyList();

  @JsonProperty("other_ships")
  private List<ShipDetailsDto> otherShips = Collections.emptyList();
}
