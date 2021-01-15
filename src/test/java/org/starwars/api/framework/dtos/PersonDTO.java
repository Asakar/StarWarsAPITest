package org.starwars.api.framework.dtos;

import io.restassured.response.Response;

import java.lang.reflect.Array;
import java.util.HashMap;
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
    private List<Object> species;
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

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public List<Object> getSpecies() {
        return species;
    }

    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getStarships() {
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
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

    public boolean typCheck(Response response, String name) {
        return getName().getClass() == String.class;
    }

    public boolean minHeightValueCheck(int min) {
        return getHeight() > min;
    }

    public boolean checkGender() {
        return getGender().matches("(n/a|male|female)");
    }

    public boolean checkIfNotEmptyORNull(String url) {
        String response = getResponse().then().extract().path(url);
        return response != null || response.length() != 0;
    }

    public boolean checkIfStartsWithCapitalLetter(String url) {
        return getResponse().then().extract().path(url).toString().substring(0,1).matches("[A-Z]");
    }

    public boolean checkIFContainsSpaces(String url) {
        return getResponse().then().extract().path(url).toString().contains(" ");
    }

//    public boolean checkIFContainsSpaces() {
//        int count = 0;
//        HashMap hashMap = getHashMap();
//        for (Object o : hashMap.entrySet()) {
//            if (o == String.class) {
//                if (((String) o).contains(" ")) {
//                    count++;
//                    System.out.println(o);
//                }
//            }
////            assert o instanceof String[];
//                for (String s : (String[]) o) {
//                    if(s.contains(" ")) {
//                        count++;
//                        System.out.println(s);
//                    }
//                }
//        }
//        System.out.println(count);
//        return count == 1;
//    }


    public boolean checkNoOfKeys() {
        return getHashMap().size() == 16;
    }

    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO();

    }


}
