package org.starwars.api.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.starwars.api.framework.dtos.PersonDTO;

public class FrameworkTest {
    private static PersonDTO personDTO;

    @BeforeAll
    public static void setup() {
        personDTO = (PersonDTO) Injector.injectIntoDTO("/people/1");
    }

    @Test
    @DisplayName("check status code is 200")
    void checkStatusCodeIs200() {
        Assertions.assertEquals(200, personDTO.getStatuCode());
    }

    @Test
    @DisplayName("check height")
    void checkHeight() {
        Assertions.assertTrue(personDTO.minHeightValueCheck(0));
    }

    @Test
    @DisplayName("check gender")
    void checkGender() {
        Assertions.assertTrue(personDTO.checkGender());
    }

}
