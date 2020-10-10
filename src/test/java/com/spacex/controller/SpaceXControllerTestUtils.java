package com.spacex.controller;

public class SpaceXControllerTestUtils {
  static final String NEXT_LAUNCH_RESPONSE_BODY =
    "{\n" +
    "    \"fairings\": {\n" +
    "        \"reused\": null,\n" +
    "        \"recovery_attempt\": null,\n" +
    "        \"recovered\": null,\n" +
    "        \"ships\": [\"fairing_ship_id\"]\n" +
    "    },\n" +
    "    \"links\": {\n" +
    "        \"patch\": {\n" +
    "            \"small\": null,\n" +
    "            \"large\": null\n" +
    "        },\n" +
    "        \"reddit\": {\n" +
    "            \"campaign\": \"https://www.reddit.com/r/spacex/comments/io0swm/gps_iii_sv04_launch_campaign_thread/\",\n" +
    "            \"launch\": \"https://www.reddit.com/r/spacex/comments/j0nu3c/rspacex_gps_iii_sv04_official_launch_discussion/\",\n" +
    "            \"media\": null,\n" +
    "            \"recovery\": null\n" +
    "        },\n" +
    "        \"flickr\": {\n" +
    "            \"small\": [],\n" +
    "            \"original\": []\n" +
    "        },\n" +
    "        \"presskit\": null,\n" +
    "        \"webcast\": null,\n" +
    "        \"youtube_id\": null,\n" +
    "        \"article\": null,\n" +
    "        \"wikipedia\": null\n" +
    "    },\n" +
    "    \"static_fire_date_utc\": \"2020-09-25T05:42:00.000Z\",\n" +
    "    \"static_fire_date_unix\": 1601012520,\n" +
    "    \"tbd\": false,\n" +
    "    \"net\": false,\n" +
    "    \"window\": null,\n" +
    "    \"rocket\": \"5e9d0d95eda69973a809d1ec\",\n" +
    "    \"success\": null,\n" +
    "    \"details\": \"SpaceX will launch GPS Block III Space Vehicle 04 from SLC-40, Cape Canaveral AFS aboard a Falcon 9. GPS III is owned and operated by the US Air Force and produced by Lockheed Martin. This will be the fourth GPS III satellite launched and the third launched by SpaceX. The satellite will be delivered into a MEO transfer orbit. The booster for this mission will land on an ASDS.\",\n" +
    "    \"crew\": [],\n" +
    "    \"ships\": [\n" +
    "        \"ship_id\"\n" +
    "    ],\n" +
    "    \"capsules\": [],\n" +
    "    \"payloads\": [\n" +
    "        \"5eb0e4d2b6c3bb0006eeb25e\"\n" +
    "    ],\n" +
    "    \"launchpad\": \"5e9e4501f509094ba4566f84\",\n" +
    "    \"auto_update\": true,\n" +
    "    \"failures\": [],\n" +
    "    \"flight_number\": 104,\n" +
    "    \"name\": \"GPS III SV04 (Sacagawea)\",\n" +
    "    \"date_utc\": \"2020-10-01T00:00:00.000Z\",\n" +
    "    \"date_unix\": 1601510400,\n" +
    "    \"date_local\": \"2020-09-30T20:00:00-04:00\",\n" +
    "    \"date_precision\": \"month\",\n" +
    "    \"upcoming\": true,\n" +
    "    \"cores\": [\n" +
    "        {\n" +
    "            \"core\": \"5f57c5440622a633027900a0\",\n" +
    "            \"flight\": 1,\n" +
    "            \"gridfins\": true,\n" +
    "            \"legs\": true,\n" +
    "            \"reused\": false,\n" +
    "            \"landing_attempt\": true,\n" +
    "            \"landing_success\": null,\n" +
    "            \"landing_type\": \"ASDS\",\n" +
    "            \"landpad\": \"5e9e3033383ecbb9e534e7cc\"\n" +
    "        }\n" +
    "    ],\n" +
    "    \"id\": \"5eb87d4cffd86e000604b38d\"\n" +
    "}";

  static final String NEXT_LAUNCH_EMPTY_SHIPS_RESPONSE_BODY =
    "{\n" +
    "    \"fairings\": {\n" +
    "        \"reused\": null,\n" +
    "        \"recovery_attempt\": null,\n" +
    "        \"recovered\": null,\n" +
    "        \"ships\": []\n" +
    "    },\n" +
    "    \"links\": {\n" +
    "        \"patch\": {\n" +
    "            \"small\": null,\n" +
    "            \"large\": null\n" +
    "        },\n" +
    "        \"reddit\": {\n" +
    "            \"campaign\": \"https://www.reddit.com/r/spacex/comments/io0swm/gps_iii_sv04_launch_campaign_thread/\",\n" +
    "            \"launch\": \"https://www.reddit.com/r/spacex/comments/j0nu3c/rspacex_gps_iii_sv04_official_launch_discussion/\",\n" +
    "            \"media\": null,\n" +
    "            \"recovery\": null\n" +
    "        },\n" +
    "        \"flickr\": {\n" +
    "            \"small\": [],\n" +
    "            \"original\": []\n" +
    "        },\n" +
    "        \"presskit\": null,\n" +
    "        \"webcast\": null,\n" +
    "        \"youtube_id\": null,\n" +
    "        \"article\": null,\n" +
    "        \"wikipedia\": null\n" +
    "    },\n" +
    "    \"static_fire_date_utc\": \"2020-09-25T05:42:00.000Z\",\n" +
    "    \"static_fire_date_unix\": 1601012520,\n" +
    "    \"tbd\": false,\n" +
    "    \"net\": false,\n" +
    "    \"window\": null,\n" +
    "    \"rocket\": \"5e9d0d95eda69973a809d1ec\",\n" +
    "    \"success\": null,\n" +
    "    \"details\": \"SpaceX will launch GPS Block III Space Vehicle 04 from SLC-40, Cape Canaveral AFS aboard a Falcon 9. GPS III is owned and operated by the US Air Force and produced by Lockheed Martin. This will be the fourth GPS III satellite launched and the third launched by SpaceX. The satellite will be delivered into a MEO transfer orbit. The booster for this mission will land on an ASDS.\",\n" +
    "    \"crew\": [],\n" +
    "    \"ships\": [],\n" +
    "    \"capsules\": [],\n" +
    "    \"payloads\": [\n" +
    "        \"5eb0e4d2b6c3bb0006eeb25e\"\n" +
    "    ],\n" +
    "    \"launchpad\": \"5e9e4501f509094ba4566f84\",\n" +
    "    \"auto_update\": true,\n" +
    "    \"failures\": [],\n" +
    "    \"flight_number\": 104,\n" +
    "    \"name\": \"GPS III SV04 (Sacagawea)\",\n" +
    "    \"date_utc\": \"2020-10-01T00:00:00.000Z\",\n" +
    "    \"date_unix\": 1601510400,\n" +
    "    \"date_local\": \"2020-09-30T20:00:00-04:00\",\n" +
    "    \"date_precision\": \"month\",\n" +
    "    \"upcoming\": true,\n" +
    "    \"cores\": [\n" +
    "        {\n" +
    "            \"core\": \"5f57c5440622a633027900a0\",\n" +
    "            \"flight\": 1,\n" +
    "            \"gridfins\": true,\n" +
    "            \"legs\": true,\n" +
    "            \"reused\": false,\n" +
    "            \"landing_attempt\": true,\n" +
    "            \"landing_success\": null,\n" +
    "            \"landing_type\": \"ASDS\",\n" +
    "            \"landpad\": \"5e9e3033383ecbb9e534e7cc\"\n" +
    "        }\n" +
    "    ],\n" +
    "    \"id\": \"5eb87d4cffd86e000604b38d\"\n" +
    "}";

  static final String SHIP_RESPONSE_BODY =
    "{\n" +
    "    \"legacy_id\": \"HAWK\",\n" +
    "    \"model\": null,\n" +
    "    \"type\": \"Tug\",\n" +
    "    \"roles\": [\n" +
    "        \"ASDS Tug\"\n" +
    "    ],\n" +
    "    \"imo\": 9103295,\n" +
    "    \"mmsi\": 366943250,\n" +
    "    \"abs\": 1033239,\n" +
    "    \"class\": 9523438,\n" +
    "    \"mass_kg\": 508023,\n" +
    "    \"mass_lbs\": 1120000,\n" +
    "    \"year_built\": 1995,\n" +
    "    \"home_port\": \"Port Canaveral\",\n" +
    "    \"status\": \"\",\n" +
    "    \"speed_kn\": null,\n" +
    "    \"course_deg\": null,\n" +
    "    \"latitude\": null,\n" +
    "    \"longitude\": null,\n" +
    "    \"last_ais_update\": null,\n" +
    "    \"link\": \"https://www.marinetraffic.com/en/ais/details/ships/shipid:430027/mmsi:366943250/imo:9103295/vessel:HAWK\",\n" +
    "    \"image\": \"https://i.imgur.com/hGWWupT.jpg\",\n" +
    "    \"launches\": [\n" +
    "        \"5eb87d0cffd86e000604b35a\",\n" +
    "        \"5eb87d0dffd86e000604b35b\",\n" +
    "        \"5eb87d13ffd86e000604b360\",\n" +
    "        \"5eb87d18ffd86e000604b365\",\n" +
    "        \"5eb87d1effd86e000604b36a\",\n" +
    "        \"5eb87d20ffd86e000604b36c\",\n" +
    "        \"5eb87d22ffd86e000604b36d\",\n" +
    "        \"5eb87d24ffd86e000604b36f\",\n" +
    "        \"5eb87d39ffd86e000604b37d\",\n" +
    "        \"5eb87d39ffd86e000604b37e\",\n" +
    "        \"5eb87d3bffd86e000604b37f\",\n" +
    "        \"5eb87d3cffd86e000604b380\",\n" +
    "        \"5eb87d3fffd86e000604b382\",\n" +
    "        \"5eb87d41ffd86e000604b383\",\n" +
    "        \"5eb87d43ffd86e000604b385\",\n" +
    "        \"5eb87d46ffd86e000604b388\"\n" +
    "    ],\n" +
    "    \"name\": \"HAWK\",\n" +
    "    \"active\": false,\n" +
    "    \"id\": \"ship_id\"\n" +
    "}";

  static final String FAIRING_SHIP_RESPONSE_BODY =
    "{\n" +
    "    \"legacy_id\": \"HAWK\",\n" +
    "    \"model\": null,\n" +
    "    \"type\": \"dummy_type\",\n" +
    "    \"roles\": [\n" +
    "        \"ASDS Tug\"\n" +
    "    ],\n" +
    "    \"imo\": 9103295,\n" +
    "    \"mmsi\": 366943250,\n" +
    "    \"abs\": 1033239,\n" +
    "    \"class\": 9523438,\n" +
    "    \"mass_kg\": 508023,\n" +
    "    \"mass_lbs\": 1120000,\n" +
    "    \"year_built\": 1995,\n" +
    "    \"home_port\": \"dummy_port\",\n" +
    "    \"status\": \"\",\n" +
    "    \"speed_kn\": null,\n" +
    "    \"course_deg\": null,\n" +
    "    \"latitude\": null,\n" +
    "    \"longitude\": null,\n" +
    "    \"last_ais_update\": null,\n" +
    "    \"link\": \"https://www.marinetraffic.com/en/ais/details/ships/shipid:430027/mmsi:366943250/imo:9103295/vessel:HAWK\",\n" +
    "    \"image\": \"https://i.imgur.com/hGWWupT.jpg\",\n" +
    "    \"launches\": [\n" +
    "        \"5eb87d0cffd86e000604b35a\"\n" +
    "    ],\n" +
    "    \"name\": \"dummy_fairing\",\n" +
    "    \"active\": false,\n" +
    "    \"id\": \"fairing_ship_id\"\n" +
    "}";

  static final String SHIP_NEXT_LAUNCH_RESPONSE_BODY =
    "{\n" +
    "    \"mission_name\": \"GPS III SV04 (Sacagawea)\",\n" +
    "    \"mission_details\": \"SpaceX will launch GPS Block III Space Vehicle 04 from SLC-40, Cape Canaveral AFS aboard a Falcon 9. GPS III is owned and operated by the US Air Force and produced by Lockheed Martin. This will be the fourth GPS III satellite launched and the third launched by SpaceX. The satellite will be delivered into a MEO transfer orbit. The booster for this mission will land on an ASDS.\",\n" +
    "    \"fairing_recovery_ships\": [" +
    "            {\"type\": \"dummy_type\",\n" +
    "            \"name\": \"dummy_fairing\",\n" +
    "            \"home_port\": \"dummy_port\"\n" +
    "        }\n" +
    "],\n" +
    "    \"other_ships\": [\n" +
    "            {\"type\": \"Tug\",\n" +
    "            \"name\": \"HAWK\",\n" +
    "            \"home_port\": \"Port Canaveral\"\n" +
    "        }\n" +
    "    ]\n" +
    "}";

  static final String NO_SHIPS_NEXT_LAUNCH_RESPONSE_BODY =
    "{\n" +
    "    \"mission_name\": \"GPS III SV04 (Sacagawea)\",\n" +
    "    \"mission_details\": \"SpaceX will launch GPS Block III Space Vehicle 04 from SLC-40, Cape Canaveral AFS aboard a Falcon 9. GPS III is owned and operated by the US Air Force and produced by Lockheed Martin. This will be the fourth GPS III satellite launched and the third launched by SpaceX. The satellite will be delivered into a MEO transfer orbit. The booster for this mission will land on an ASDS.\",\n" +
    "    \"fairing_recovery_ships\": [],\n" +
    "    \"other_ships\": []\n" +
    "}";
  static final String SHIP_ID = "ship_id";
  static final String FAIRING_SHIP_ID = "fairing_ship_id";
}
