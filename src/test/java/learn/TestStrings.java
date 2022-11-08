package learn;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStrings {

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

    @Test
    void testOperatorEquals(){
        // test de ==
        String city1 = "Toulouse";
        String city2 = "Tou" + "louse";
        // 2 strings are stored as one string in memory
        boolean eq = city1 == city2;
        System.out.println(eq);
        String city3 = "Toulouse".toLowerCase();
        String city4 = "TOULOusE".toLowerCase();
        // 2 identical strings are stored at different @ in memory
        boolean eq2 = city3 == city4;
        System.out.println(eq2);
     }
     @Test
     void testMethodEquals() {
         String city3 = "Toulouse".toLowerCase();
         String city4 = "TOULOusE".toLowerCase();
         boolean eq = city3.equals(city4);
         System.out.println(eq);
     }









}
