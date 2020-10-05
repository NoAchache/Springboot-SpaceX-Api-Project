package com.spacex.controller;

import com.spacex.dto.NextLaunchDto;
import com.spacex.dto.NextLaunchShipDetailsDto;
import com.spacex.exception.SpaceXApiException;
import com.spacex.service.SpaceXService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequiredArgsConstructor
@RequestMapping("/spaceX")
public class SpaceXController {
    private final SpaceXService spaceXService;
    @GetMapping("/ships-next-launch")
    public NextLaunchShipDetailsDto getNextLaunchInfos() throws SpaceXApiException {
        NextLaunchDto nextLaunchDto =  spaceXService.getSpaceXNextLaunch();
        return spaceXService.getSpaceXShipsDetailsOfNextLaunch(nextLaunchDto);
    }
}
