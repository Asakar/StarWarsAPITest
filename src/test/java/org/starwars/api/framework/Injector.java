package org.starwars.api.framework;

import io.restassured.response.Response;
import org.starwars.api.framework.dtos.PersonDTO;
import org.starwars.api.framework.dtos.StarWarsDTO;

public class Injector {

    public static StarWarsDTO personDTO(Response response) {
        StarWarsDTO tempDTO = response.getBody().as(PersonDTO.class);
        return tempDTO;
    }

    public static void main(String[] args) {
        personDTO(ConnectionManger.getConnection("/people/1"));
//        System.out.println();
    }


}
