package org.starwars.api.framework.injecting;

import org.starwars.api.framework.dtos.*;

public class Injector {

    public static StarWars injectIntoDTO(String url) {
        StarWars starWarsDTO = DTOFactory.getDTO(url);
        starWarsDTO.setResponse(DTOFactory.getResponse());
        starWarsDTO.setHashMap(DTOFactory.mapDTO());
        return starWarsDTO;
    }

    public static PeopleDTO getPeople() {
        return (PeopleDTO) injectIntoDTO("/people");
    }

    public static PersonDTO getPeople(String person) {
        return (PersonDTO) injectIntoDTO("/people/" + person);
    }

    public static PlanetsDTO getPlanets() {
        return (PlanetsDTO) injectIntoDTO("/planets");
    }

    public static PlanetDTO getPlanets(String planet) {
        return (PlanetDTO) injectIntoDTO("/planets/" + planet);
    }

    public static void main(String[] args) {
        PersonDTO dto = getPeople("1");
        System.out.println(dto.getHashMap().size());
        System.out.println(dto.getHashMap().get("name"));
//        System.out.println(dto.mapDTO().get("name"));
    }


}
