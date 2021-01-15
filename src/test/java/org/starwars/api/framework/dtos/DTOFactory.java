package org.starwars.api.framework.dtos;

import io.restassured.response.Response;
import org.starwars.api.framework.connecting.ConnectionManger;

import java.util.HashMap;

public class DTOFactory {
    private static Response response;


    public static StarWars getDTO(String url) {
        response = ConnectionManger.getConnection(url);
        if (url.charAt(url.length()-1) == '/') {
            url = url.substring(0, url.lastIndexOf('/'));
        }
        if (url.matches("(/people)")) {
            return response.getBody().as(PeopleDTO.class);
        }
        else if (url.matches("(/people/)[0-9]")) {
            return response.getBody().as(PersonDTO.class);
        } else if (url.matches("(/planets)")) {
            return response.getBody().as(PlanetsDTO.class);
        }
        else if (url.matches("(/planets/)[0-9]")) {
            return response.getBody().as(PlanetDTO.class);
        }
        else {
            return null;
        }
    }

    public static Response getResponse() {
        return response;
    }

    public static HashMap mapDTO() {
        HashMap map = getResponse().getBody().as(HashMap.class);
        return map;
    }

}
