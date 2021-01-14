package org.starwars.api.framework;

import io.restassured.response.Response;
import org.starwars.api.framework.dtos.*;

public class Injector {

    public static StarWars injectIntoDTO(String url) {
        StarWars starWarsDTO = DTOFactory.getDTO(url);
        starWarsDTO.setResponse(DTOFactory.getResponse());
        return starWarsDTO;
    }

    public static PeopleDTO getPeople() {
        return (PeopleDTO) injectIntoDTO("/people");
    }

    public static void main(String[] args) {
        PlanetsDTO planetsDTO = (PlanetsDTO) injectIntoDTO("/planets/");
        System.out.println(planetsDTO.getCount());
    }


}
