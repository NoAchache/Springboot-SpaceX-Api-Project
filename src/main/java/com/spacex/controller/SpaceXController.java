package com.spacex.controller;

import com.spacex.dto.NextLaunchDto;
import com.spacex.dto.NextLaunchShipDetailsDto;
import com.spacex.exception.SpaceXApiException;
import com.spacex.service.SpaceXService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/spaceX")
public class SpaceXController {
  private final SpaceXService spaceXService;

  @GetMapping("/ships-next-launch")
  public NextLaunchShipDetailsDto getNextLaunchInfos() {
    try {
      NextLaunchDto nextLaunchDto = spaceXService.getSpaceXNextLaunch();
      return spaceXService.getSpaceXShipsDetailsOfNextLaunch(nextLaunchDto);
    } catch (SpaceXApiException e) {
      throw new ResponseStatusException(
        HttpStatus.FAILED_DEPENDENCY,
        e.getMessage()
      );
    }
  }
}
