package com.spacex.service;

import com.spacex.dto.NextLaunchDto;
import com.spacex.dto.NextLaunchShipDetailsDto;
import com.spacex.dto.ShipDetailsDto;
import com.spacex.exception.SpaceXApiException;
import com.spacex.mapper.SpaceXMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j // TODO: add logs
public class SpaceXService {
    private final SpaceXClientService spaceXClientService;
    private final SpaceXMapper spaceXMapper;

    public NextLaunchDto getSpaceXNextLaunch() throws SpaceXApiException {
        return spaceXClientService.getSpaceXNextLaunch();
    }

    public NextLaunchShipDetailsDto getSpaceXShipsDetailsOfNextLaunch(NextLaunchDto nextLaunchDto)
            throws SpaceXApiException {
        List<String> fairingRecoveryShipsIds = nextLaunchDto.getFairings().getShipsIds();

        // otherShipsIds denotes ships which are not used to recover fairing.
        List<String> otherShipsIds = nextLaunchDto.getShipsIds();
        otherShipsIds.removeAll(fairingRecoveryShipsIds);
        List<ShipDetailsDto> fairingRecoveryShipsDetailsDtos = getSpaceXShipsDetails(fairingRecoveryShipsIds);
        List<ShipDetailsDto> otherShipsDetailsDtos = getSpaceXShipsDetails(otherShipsIds);
        return spaceXMapper.from(nextLaunchDto, fairingRecoveryShipsDetailsDtos, otherShipsDetailsDtos);
    }

    private List<ShipDetailsDto> getSpaceXShipsDetails(List<String> shipIds) throws SpaceXApiException {
        List<ShipDetailsDto> shipDetailsDtos = new ArrayList<>();
        for (String shipId : shipIds) {
            shipDetailsDtos.add(spaceXClientService.getSpaceXShip(shipId));
        }
        return shipDetailsDtos;
    }
}
