package com.simpleproject.service;

import com.simpleproject.exception.SpaceXApiException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j // TODO: add logs
public class SpaceXService {
    private final SpaceXClientService spaceXClientService;

    public String getSpaceXNextLaunch() throws SpaceXApiException {
        return spaceXClientService.getSpaceXNextLaunch();
    }
}
