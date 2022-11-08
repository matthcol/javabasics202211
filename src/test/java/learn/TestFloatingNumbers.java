package learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

// IEEE754
public class TestFloatingNumbers {

    @Test
    void testDoubles() {
        double x = 3.75;
        double y = 1.25D;
        double z = 3.1459E38;
        double w = -3.1459E-38;
        for (double n : List.of(x, y, z, w)) {
            System.out.println(n);
        }
    }

    @Test
    void testComputeOperators(){
        double x = 7D; // 7. or 7.0
        double y = ((x + 3) * 10) / 9 - 1;
        System.out.println(y);
        assertEquals(10.11111, y, 1E-5);
    }

    @Test
    void testTagadaStrawberryDouble(){
        // 0.123 (10) = 1*10^-1 + 2*10^-2 + 3*10^-3
        // 0.1 (10) = 0.000110011001100110011.. (2)
        double price = 0.10;
        for (int i = 1; i <= 3 ; i++) {
            double totalPrice = i * price;
            System.out.println(totalPrice);
        }
    }

    @Test
    void testTagadaStrawberryFloat(){
        float price = 0.10F;
        for (int i = 1; i <= 3 ; i++) {
            float totalPrice = i * price;
            System.out.printf("%.8f%n", totalPrice);
        }
    }

    @Test
    void testInfinity(){
        double inf = Double.POSITIVE_INFINITY;
        System.out.println(inf);
        double x = 1E308;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        double z = 1 / inf;
        System.out.println(z);
        double w = 1 / 0D;
        System.out.println(w);
        w = 0 / 0D;
        System.out.println(w);
    }

}
