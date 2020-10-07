package com.spacex.mapper;

import com.spacex.dto.NextLaunchDto;
import com.spacex.dto.NextLaunchShipDetailsDto;
import com.spacex.dto.ShipDetailsDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SpaceXMapper {
  @Mapping(target = "missionName", source = "nextLaunchDto.name")
  @Mapping(target = "missionDetails", source = "nextLaunchDto.details")
  @Mapping(
    target = "fairingRecoveryShips",
    source = "fairingRecoveryShipsDetailsDtos"
  )
  @Mapping(target = "otherShips", source = "otherShipsShipsDetailsDtos")
  NextLaunchShipDetailsDto from(
    NextLaunchDto nextLaunchDto,
    List<ShipDetailsDto> fairingRecoveryShipsDetailsDtos,
    List<ShipDetailsDto> otherShipsShipsDetailsDtos
  );
}
