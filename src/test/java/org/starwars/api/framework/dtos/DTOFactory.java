package org.starwars.api.framework.dtos;

import io.restassured.response.Response;
import org.starwars.api.framework.ConnectionManger;

public class DTOFactory {
    private static Response response;

    public static StarWarsDTO getDTO(String url) {
        response = ConnectionManger.getConnection(url);
//        return response.getBody().as(PersonDTO.class);
        switch (url) {
            case "/people/1/":
                return response.getBody().as(PersonDTO.class);
            case "/planets/1":
                return response.getBody().as(PlanetsDTO.class);
            default:
                return null;
        }
    }

    public static Response getResponse() {
        return response;
    }
}
