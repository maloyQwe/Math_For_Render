package Tests;

import Math.Vector2;
import Math.Vector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector2Test {

    @Test
    void sum() {
        Vector v1 = new Vector2(1, 2);
        Vector v2 = new Vector2(3, 4);
        Vector expectedResult = new Vector2(4, 6);

        Vector result = v1.sum( v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());

    }


    @Test
    void subtract() {
        Vector v1 = new Vector2(1, 4);
        Vector v2 = new Vector2(3, 2);
        Vector expectedResult = new Vector2(-2, 2);

        Vector result = v1.subtract( v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
    }

    @Test
    void multiplyOnScalar() {
        Vector v1 = new Vector2(1, 2);
        double scalar = 5;
        Vector expectedResult = new Vector2(5, 10);

        Vector result = v1.multiplyOnScalar( scalar);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
    }

    @Test
    void divisionOnScalar() {
        Vector v1 = new Vector2(1, 5);
        double scalar = 5;
        Vector expectedResult = new Vector2(0.2, 1);

        Vector result = v1.divisionOnScalar( scalar);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
    }

    @Test
    void length() {
        Vector v1 = new Vector2(3, 4);
        double expectedResult = 5;

        double result = v1.length(v1);

        assertEquals(expectedResult, result);

    }

    @Test
    void normalize() {
        Vector v1 = new Vector2(3, 4);
        Vector expectedResult = new Vector2(0.6, 0.8);

        Vector result = v1.normalize(v1);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
    }

    @Test
    void scalarProduct() {
        Vector v1 = new Vector2(1, 2);
        Vector v2 = new Vector2(4, 5);
        double expectedResult = 14;

        double result = v1.scalarProduct( v2);

        assertEquals(expectedResult, result);
    }
}