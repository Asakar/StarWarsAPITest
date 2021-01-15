package org.starwars.api.framework.connecting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ConnectionManger {

    private static final String BASEURL = "https://swapi.dev/api";
    private static String endPoint = "";

    public static Response getConnection() {
        return RestAssured.get(BASEURL);
    }

    public static Response getConnection(String endPoint) {
        return RestAssured.get(BASEURL + endPoint);
    }


}
