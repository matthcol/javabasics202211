package learn;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVariables {

    @Test
    void testStringUninitializedVariable() {
        String city; // non initialized
        // System.out.println(city); // forbidden
        city = "Toulouse";
        System.out.println(city);
    }

    @Test
    void testStringInitializedVariable(){
        String city = "Toulouse";
        System.out.println(city);
        String message = city + " la ville rose, avec "
                + 470000 + " habitants";
        System.out.println(message);
        System.out.println("Nb lettres: " + city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        message += " ; il fait beau aujourd'hui";
        System.out.println(message);
        // first character at index 0
        System.out.println(city.substring(4));
        System.out.println(city.substring(4, 6));
    }

    @Test
    void testSubstringOutOfBounds(){
        String city = "Toulouse";
        assertThrows(IndexOutOfBoundsException.class,
                () -> city.substring(9)
        );
    }
}
