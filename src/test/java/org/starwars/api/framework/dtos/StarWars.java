package org.starwars.api.framework.dtos;

import io.restassured.response.Response;

public abstract class StarWars {

    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public int getStatuCode() {
        return response.statusCode();
    }

}
