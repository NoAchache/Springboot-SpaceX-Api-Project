package com.simpleproject.controller;

import com.simpleproject.dto.NextLaunchDto;
import com.simpleproject.exception.SpaceXApiException;
import com.simpleproject.service.SpaceXService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequiredArgsConstructor
@RequestMapping("/spaceX")
@Slf4j //TODO:add logs
public class SpaceXController {
    private final SpaceXService spaceXService;

    @GetMapping("/ships-next-launch") // TODO:rename
    public NextLaunchDto getNextLaunchInfos() throws SpaceXApiException {
        NextLaunchDto nextLaunchDto =  spaceXService.getSpaceXNextLaunch();
        spaceXService.getSpaceXShipsDetailsOfNextLaunch(nextLaunchDto);

        return nextLaunchDto;


    }
}
