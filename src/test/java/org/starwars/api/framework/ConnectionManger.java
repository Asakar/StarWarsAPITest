package org.starwars.api.framework;

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
        setEndPoint(endPoint);
        return RestAssured.get(BASEURL + endPoint);
    }

    public static void setEndPoint(String endPoint) {
        ConnectionManger.endPoint = endPoint;
    }

    public static String getEndPoint() {
        return endPoint;
    }

    public static ValidatableResponse getStatusCode() {
        return getConnection(getEndPoint()).then().assertThat().statusCode(200);
    }


}
