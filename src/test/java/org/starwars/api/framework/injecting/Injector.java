package org.starwars.api.framework.injecting;

import org.starwars.api.framework.dtos.*;
import org.starwars.api.framework.factory.DTOFactory;

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

    public static FilmsDTO getFilms() {
        return (FilmsDTO) injectIntoDTO("/films");
    }

    public static FilmDTO getFilms(String film) {
        return (FilmDTO) injectIntoDTO("/films/" + film);
    }

    public static SpeciesDTO getSpeciesDTO() {
        return (SpeciesDTO) injectIntoDTO("/species");
    }

    public static ASpeciesDTO getSpeciesDTO(String species) {return (ASpeciesDTO) injectIntoDTO("/species/" + species);}

    public static StarShipsDTO getStarShips() {
        return (StarShipsDTO) injectIntoDTO("/starships");
    }

    public static StarShipDTO getStarShips(String starship) {
        return (StarShipDTO) injectIntoDTO("/starships/" + starship);
    }

    public static VehiclesDTO getVehicles() {
        return (VehiclesDTO) injectIntoDTO("/vehicles");
    }

    public static VehicleDTO getVehicles(String vehicles) {
        return (VehicleDTO) injectIntoDTO("/vehicles/" + vehicles);
    }

}
