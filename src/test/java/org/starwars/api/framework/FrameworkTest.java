package org.starwars.api.framework;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.starwars.api.framework.dtos.PersonDTO;
import org.starwars.api.framework.dtos.PlanetsDTO;
import org.starwars.api.framework.injecting.Injector;

public class FrameworkTest {
    private static PersonDTO personDTO;
    private static PlanetsDTO planetsDTO;

    @BeforeAll
    public static void setup() {
        personDTO = Injector.getPeople("1");
    }

    @Test
    @DisplayName("check status code is 200")
    void checkStatusCodeIs200() {
        Assertions.assertEquals(200, personDTO.getStatuCode());
    }

    @Test
    @DisplayName("check min height")
    void checkMinHeight() {
        Assertions.assertTrue(personDTO.minHeightValueCheck(0));
    }

    @Test
    @DisplayName("check gender")
    void checkGender() {
        Assertions.assertTrue(personDTO.checkGender());
    }

    @Test
    @DisplayName("no of vehicles")
    void noOfVehicles() {

    }

    @Test
    @DisplayName("checkIfNull")
    void checkIfNull() {
        Assertions.assertTrue(personDTO.checkIfNotEmptyORNull("name"));
    }

    @Test
    @DisplayName("check if value starts with a capital letter")
    void checkIfValueStartsWithACapitalLetter() {
//        Assertions.assertTrue(personDTO.checkIfStartsWithCapitalLetter("hair_color"));
        Assertions.assertTrue(personDTO.checkIfStartsWithCapitalLetter("name"));
    }

    @Test
    @DisplayName("Check if contains spaces")
    void checkIfContainsSpaces() {
        Assertions.assertTrue(personDTO.checkIFContainsSpaces("name"));
        Assertions.assertTrue(personDTO.checkIFContainsSpaces("hair_color"));
    }

    @Test
    @DisplayName("check no of keys")
    void checkNoOfKeys() {
        Assertions.assertTrue(personDTO.checkNoOfKeys());
    }
    

}
