package com.simpleproject.controller;

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

    @GetMapping("/next-launch") // TODO:rename
    public String getNextLaunchInfos() throws SpaceXApiException {
        return spaceXService.getSpaceXNextLaunch();
    }
}
