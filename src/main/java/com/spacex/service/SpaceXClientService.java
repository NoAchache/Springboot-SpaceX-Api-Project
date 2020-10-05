package com.spacex.service;

import com.spacex.dto.NextLaunchDto;
import com.spacex.dto.ShipDetailsDto;
import com.spacex.exception.SpaceXApiException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import javax.annotation.PostConstruct;


@Service
@RequiredArgsConstructor
@Slf4j // TODO: add logs
public class SpaceXClientService {
    private WebClient webClient;
    private static final String baseUrl = "https://api.spacexdata.com/v4/";

    @PostConstruct
    @SuppressWarnings("unused")
    public void setup() {
        webClient = WebClient.create(baseUrl);
    }

    public NextLaunchDto getSpaceXNextLaunch() throws SpaceXApiException {
        try {
            String uri = "launches/next";
            log.info("Retrieving next SpaceX launch. Call: GET " + baseUrl + uri);

            NextLaunchDto response = webClient
                    .get()
                    .uri(uri)
                    .retrieve()
                    .bodyToMono(NextLaunchDto.class)
                    .block();

            log.info("Successfully retrieved next SpaceX launch");

            return response;
        } catch (WebClientResponseException e) {
            log.error(String.format("Error while calling the SpaceX Api to get next launch. Message: %s", e.getMessage()));
            throw new SpaceXApiException("Error getting next SpaceX launch");
        }
    }

    public ShipDetailsDto getSpaceXShip(String shipId) throws SpaceXApiException {
        try {
            String uri = "ships/" + shipId;
            log.info("Retrieving ship details. Call: GET " + baseUrl + uri);

            ShipDetailsDto response = webClient
                    .get()
                    .uri(uri)
                    .retrieve()
                    .bodyToMono(ShipDetailsDto.class)
                    .block();

            log.info("Successfully retrieved ship details");

            return response;
        } catch (WebClientResponseException e) {
            log.error(String.format("Error while calling the SpaceX Api to get ship with id %s. Message: %s", shipId, e.getMessage()));
            throw new SpaceXApiException("Error getting SpaceX ship");
        }
    }
}

