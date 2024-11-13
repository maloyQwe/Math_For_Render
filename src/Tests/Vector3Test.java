package Tests;

import Math.Vector3;
import Math.Vector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector3Test {

    @Test
    void sum() {
        Vector v1 = new Vector3(1, 2, 4);
        Vector v2 = new Vector3(3, 4, 5);
        Vector expectedResult = new Vector3(4, 6, 9);

        Vector result = v1.sum( v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());

    }

    @Test
    void subtract() {
        Vector v1 = new Vector3(1, 4, 6);
        Vector v2 = new Vector3(3, 2, 0);
        Vector expectedResult = new Vector3(-2, 2, 6);

        Vector result = v1.subtract( v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
    }

    @Test
    void multiplyOnScalar() {
        Vector v1 = new Vector3(1, 2, 8);
        double scalar = 5;
        Vector expectedResult = new Vector3(5, 10, 40);

        Vector result = v1.multiplyOnScalar( scalar);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());

    }

    @Test
    void divisionOnScalar() {
        Vector v1 = new Vector3(1, 5, 0);
        double scalar = 5;
        Vector expectedResult = new Vector3(0.2, 1, 0);

        Vector result = v1.divisionOnScalar( scalar);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
    }

    @Test
    void length() {
        Vector v1 = new Vector3(2, 1, 2);
        double expectedResult = 3;

        double result = v1.length(v1);

        assertEquals(expectedResult, result);
    }

    @Test
    void normalize() {
        Vector v1 = new Vector3(2, 1, 2);
        Vector expectedResult = new Vector3(0.6666666666666666, 0.3333333333333333, 0.6666666666666666);

        Vector result = v1.normalize(v1);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
    }

    @Test
    void scalarProduct() {
        Vector v1 = new Vector3(1, 2,7);
        Vector v2 = new Vector3(4, 5,6);
        double expectedResult = 56;

        double result = v1.scalarProduct( v2);

        assertEquals(expectedResult, result);
    }

    @Test
    void vectorProduct() {
        Vector3 v1 = new Vector3(1, 2, 7);
        Vector v2 = new Vector3(4, 5,6);
        Vector expectedResult = new Vector3(-23, 22, -3);

        Vector result = v1.vectorProduct(v1,v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
    }
}