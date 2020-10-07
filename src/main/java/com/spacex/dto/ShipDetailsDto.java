package com.spacex.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipDetailsDto {
  private String type;

  @JsonProperty("home_port")
  private String homePort;

  private String name;
}
