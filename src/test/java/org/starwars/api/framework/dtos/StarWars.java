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
}
