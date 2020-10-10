package com.spacex.controller;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpaceXControllerTest {
  @Autowired
  private MockMvc mockMvc;

  private static ClientAndServer spaceXMockServer;

  @BeforeAll
  public static void startup() {
    // 8500 is the local port specified in the application.yml of test directory
    spaceXMockServer = startClientAndServer(8500);
  }

  @BeforeEach
  public void reset() {
    spaceXMockServer.reset();
  }

  private void instantiateSpaceXMockServer(
    String uri,
    String responseBody,
    int statusCode
  ) {
    spaceXMockServer
      .when(request().withMethod(HttpMethod.GET.name()).withPath(uri))
      .respond(
        response()
          .withHeader(
            HttpHeaderNames.CONTENT_TYPE.toString(),
            MediaType.APPLICATION_JSON.toString()
          )
          .withBody(responseBody)
          .withStatusCode(statusCode)
      );
  }

  private void mockGetShipsNextLaunchSuccess(String outputBody)
    throws Exception {
    mockMvc
      .perform(get("/spaceX/ships-next-launch"))
      .andExpect(status().isOk())
      .andExpect(content().contentType(MediaType.APPLICATION_JSON))
      .andExpect(content().json(outputBody))
      .andReturn();
  }

  private void mockGetShipsNextLaunchFailedDependency() throws Exception {
    mockMvc
      .perform(get("/spaceX/ships-next-launch"))
      .andExpect(status().isFailedDependency())
      .andReturn();
  }

  @Test
  void testGetShipsNextLaunchSuccess() throws Exception {
    instantiateSpaceXMockServer(
      "/launches/next",
      SpaceXControllerTestUtils.NEXT_LAUNCH_RESPONSE_BODY,
      200
    );

    instantiateSpaceXMockServer(
      "/ships/" + SpaceXControllerTestUtils.SHIP_ID,
      SpaceXControllerTestUtils.OTHER_SHIP_RESPONSE_BODY,
      200
    );

    instantiateSpaceXMockServer(
      "/ships/" + SpaceXControllerTestUtils.FAIRING_SHIP_ID,
      SpaceXControllerTestUtils.FAIRING_SHIP_RESPONSE_BODY,
      200
    );

    mockGetShipsNextLaunchSuccess(
      SpaceXControllerTestUtils.SHIP_NEXT_LAUNCH_RESPONSE_BODY
    );
  }

  @Test
  void testNoShipsSuccess() throws Exception {
    instantiateSpaceXMockServer(
      "/launches/next",
      SpaceXControllerTestUtils.NEXT_LAUNCH_EMPTY_SHIPS_RESPONSE_BODY,
      200
    );

    mockGetShipsNextLaunchSuccess(
      SpaceXControllerTestUtils.NO_SHIPS_NEXT_LAUNCH_RESPONSE_BODY
    );
  }

  @Test
  void testGetNextLaunchError() throws Exception {
    instantiateSpaceXMockServer("/launches/next", "", 400);

    mockGetShipsNextLaunchFailedDependency();
  }

  @Test
  void testGetShipError() throws Exception {
    instantiateSpaceXMockServer(
      "/launches/next",
      SpaceXControllerTestUtils.NEXT_LAUNCH_RESPONSE_BODY,
      200
    );

    instantiateSpaceXMockServer(
      "/ships/" + SpaceXControllerTestUtils.SHIP_ID,
      "",
      400
    );

    instantiateSpaceXMockServer(
      "/ships/" + SpaceXControllerTestUtils.FAIRING_SHIP_ID,
      "",
      400
    );

    mockGetShipsNextLaunchFailedDependency();
  }
}
