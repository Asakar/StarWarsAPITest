package org.starwars.api.framework.dtos;

public class DTOFactory {

    public static StarWarsDTO getSorter(String url) {
        switch (url) {
            case "person":
                return new PersonDTO();
            case "planets":
                return new PlanetsDTO();
            default:
                return null;
        }
    }

}
