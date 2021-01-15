package org.starwars.api.framework.dtos;

import org.starwars.api.framework.injecting.Injector;

import java.util.ArrayList;
import java.util.List;

public class PersonDTO extends StarWars {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String created;
    private String edited;
    private String url;

    public PersonDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return Integer.parseInt(height);
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
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

    public List<FilmDTO> getFilms() {
        ArrayList<FilmDTO> movies = new ArrayList<>();
        for (String film : films) {
            movies.add(Injector.getFilms(film.substring(film.length()-2)));
        }
        return movies;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public ArrayList<ASpeciesDTO> getSpecies() {
        ArrayList<ASpeciesDTO> species = new ArrayList<>();
        for (String temp : this.species) {
            species.add(Injector.getSpeciesDTO(temp.substring(temp.length()-2)));
        }
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public ArrayList<VehicleDTO> getVehicles() {
        ArrayList<VehicleDTO> vehicles = new ArrayList<>();
        for (String vehicle : this.vehicles) {
            vehicles.add(Injector.getVehicles(vehicle.substring(vehicle.length()-2)));
        }
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<StarShipDTO> getStarships() {
        ArrayList<StarShipDTO> starships = new ArrayList<>();
        for (String starship : this.starships) {
            starships.add(Injector.getStarShips(starship.substring(starship.length()-2)));
        }
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public boolean minHeightValueCheck(int min) {
        return getHeight() > min;
    }

    public boolean checkGender() {
        return getGender().matches("(n/a|male|female)");
    }

}
