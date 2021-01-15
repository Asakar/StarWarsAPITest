package org.starwars.api.framework.factory;

import io.restassured.response.Response;
import org.starwars.api.framework.connecting.ConnectionManger;
import org.starwars.api.framework.dtos.*;

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
        }
        else if (url.matches("(/planets)")) {
            return response.getBody().as(PlanetsDTO.class);
        }
        else if (url.matches("(/planets/)[0-9]")) {
            return response.getBody().as(PlanetDTO.class);
        }
        else if (url.matches("(/films)")) {
            return response.getBody().as(FilmsDTO.class);
        }
        else if (url.matches("(/films/)[0-9]")) {
            return response.getBody().as(FilmDTO.class);
        }
        else if (url.matches("(/species)")) {
            return response.getBody().as(SpeciesDTO.class);
        }
        else if (url.matches("(/species/)[0-9]")) {
            return response.getBody().as(ASpeciesDTO.class);
        }
        else if (url.matches("(/starships)")) {
            return response.getBody().as(StarShipsDTO.class);
        }
        else if (url.matches("(/starships/)[0-9]")) {
            return response.getBody().as(StarShipDTO.class);
        }
        else if (url.matches("(/vehicles)")) {
            return response.getBody().as(VehiclesDTO.class);
        }
        else if (url.matches("(/vehicles/)[0-9]")) {
            return response.getBody().as(VehicleDTO.class);
        }
        return null;
    }

    public static Response getResponse() {
        return response;
    }

    public static HashMap mapDTO() {
        return getResponse().getBody().as(HashMap.class);
    }

}
