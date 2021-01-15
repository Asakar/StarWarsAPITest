package org.starwars.api.framework.dtos;

import io.restassured.response.Response;

import java.util.HashMap;

public abstract class StarWars {

    private Response response;
    private HashMap hashMap;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public int getStatuCode() {
        return response.statusCode();
    }

    public HashMap getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
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

    public boolean checkNoOfKeys(int value) {
        return getHashMap().size() == value;
    }

}
