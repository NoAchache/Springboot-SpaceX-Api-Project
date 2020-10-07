package com.spacex.controller;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import org.junit.jupiter.api.AfterAll;
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
    spaceXMockServer = startClientAndServer(8500);
  }

  @AfterAll
  public static void cleanUp() {
    spaceXMockServer.stop();
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

  @Test
  void testGetShipsNextLaunchSuccess() throws Exception {
    instantiateSpaceXMockServer(
      "/launches/next",
      SpaceXControllerTestUtils.NEXT_LAUNCH_RESPONSE_BODY,
      200
    );

    instantiateSpaceXMockServer(
      "/ships/" + SpaceXControllerTestUtils.SHIP_ID,
      SpaceXControllerTestUtils.SHIP_RESPONSE_BODY,
      200
    );

    instantiateSpaceXMockServer(
      "/ships/" + SpaceXControllerTestUtils.FAIRING_SHIP_ID,
      SpaceXControllerTestUtils.FAIRING_SHIP_RESPONSE_BODY,
      200
    );

    mockMvc
      .perform(get("/spaceX/ships-next-launch"))
      .andExpect(status().isOk())
      .andExpect(content().contentType(MediaType.APPLICATION_JSON))
      .andExpect(
        content().json(SpaceXControllerTestUtils.SHIP_NEXT_LAUNCH_RESPONSE_BODY)
      )
      .andReturn();
  }
}
