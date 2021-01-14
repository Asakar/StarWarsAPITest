package org.starwars.api.framework;

import io.restassured.response.Response;
import org.starwars.api.framework.dtos.DTOFactory;
import org.starwars.api.framework.dtos.PersonDTO;
import org.starwars.api.framework.dtos.StarWarsDTO;

public class Injector {

    public static StarWarsDTO personDTO(Response response) {
        StarWarsDTO tempDTO = response.getBody().as(PersonDTO.class);
        return tempDTO;
    }

    public static PersonDTO personDTO(String url) {
        PersonDTO starWarsDTO = (PersonDTO) DTOFactory.getDTO(url);
        starWarsDTO.setResponse(DTOFactory.getResponse());
        return starWarsDTO;
    }

    public static void main(String[] args) {
//        PersonDTO personDTO = (PersonDTO) personDTO(ConnectionManger.getConnection("/people/1"));
        PersonDTO personDTO = personDTO("/people/1/");
        System.out.println(personDTO.getResponse().then().assertThat().statusCode(200));
        System.out.println(personDTO.getHeight());
//        System.out.println();
    }


}
