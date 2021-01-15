package org.starwars.api.framework.dtos;

import org.starwars.api.framework.injecting.Injector;

import java.util.ArrayList;
import java.util.List;

public class FilmDTO extends StarWars {
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private List<String> characters;
    private List<String> planets;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> species;
    private String created;
    private String edited;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public List<PersonDTO> getCharacters() {
        ArrayList<PersonDTO> actors = new ArrayList<>();
        for (String character : characters) {
            actors.add(Injector.getPeople(character.substring(character.length()-2)));
        }
        return actors;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public List<PlanetDTO> getPlanets() {
        ArrayList<PlanetDTO> planets = new ArrayList<>();
        for (String planet : this.planets) {
            planets.add(Injector.getPlanets(planet.substring(planet.length()-2)));
        }
        return planets;
    }

    public void setPlanets(List<String> planets) {
        this.planets = planets;
    }

    public List<StarShipDTO> getStarships() {
        ArrayList<StarShipDTO> starships = new ArrayList<>();
        for (String starship : this.starships) {
            starships.add(Injector.getStarShips(starship.substring(starship.length()-2)));
        }
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public List<VehicleDTO> getVehicles() {
        ArrayList<VehicleDTO> vehicles = new ArrayList<>();
        for (String vehicle : this.vehicles) {
            vehicles.add(Injector.getVehicles(vehicle.substring(vehicle.length()-2)));
        }
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<ASpeciesDTO> getSpecies() {
        ArrayList<ASpeciesDTO> species = new ArrayList<>();
        for (String temp : this.species) {
            species.add(Injector.getSpeciesDTO(temp.substring(temp.length()-2)));
        }
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
