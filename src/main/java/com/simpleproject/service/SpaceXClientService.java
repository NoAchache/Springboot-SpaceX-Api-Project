package com.simpleproject.service;

import com.simpleproject.exception.SpaceXApiException;
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

    @PostConstruct
    @SuppressWarnings("unused")
    public void setup() {
        webClient = WebClient.create("https://api.spacexdata.com/v4/");
    }

    public String getSpaceXNextLaunch() throws SpaceXApiException {
        try {
            log.info("XXXX");

            String response = webClient
                    .get()
                    .uri("/launches/next")
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            log.info("xxx");

            return response;
        } catch (WebClientResponseException e) {
            log.error(String.format("Error while calling the SpaceX Api to get next launch %s", e.getMessage()));
            throw new SpaceXApiException("Error getting next SpaceX launch");
        }
    }

}

