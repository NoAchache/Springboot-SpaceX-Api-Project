# Springboot-SpaceX-Api-Project

Simple springboot project using the [unofficial Space X api](https://github.com/r-spacex/SpaceX-API).

The main information about the ships (fairing recovery ships + other ships) involved in the next space X launch are retrieved and gathered in a json, as shown below:

<img src="https://github.com/NoAchache/Springboot-SpaceX-Api-Project/blob/master/application_output.png">


## Run the application

* Start the application: `./mvnw spring-boot:run`
* Run the following request (on Postman for instance): `GET http://localhost:8001/spaceX/ships-next-launch`


## Overview of the code

The entry point of the route `spaceX/ships-next-launch` is in the controller. 

Firstly, the route `GET https://api.spacexdata.com/v4/launches/nextlaunch` (Space X Api) is called to retrieve some information about the next launch, most importantely the ships' ids. For each id, the associated ship's information are obtained by calling the route `GET https://api.spacexdata.com/v4/ships/{id}`

The dtos obtained from each call are then given to a mapper, which outputs a final dto containing the information shown in the Postman screenshot above.

Tests are also provided.
