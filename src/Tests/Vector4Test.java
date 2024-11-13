package Tests;

import Math.Vector;
import Math.Vector4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vector4Test {

    @Test
    void sum() {
        Vector v1 = new Vector4(1, 2, 4, 0);
        Vector v2 = new Vector4(3, 4, 5, 7);
        Vector expectedResult = new Vector4(4, 6, 9, 7);

        Vector result = v1.sum(v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
        assertEquals(expectedResult.getW(), result.getW());
    }

    @Test
    void subtract() {
        Vector v1 = new Vector4(1, 4, 6, 0);
        Vector v2 = new Vector4(3, 2, 0, 7);
        Vector expectedResult = new Vector4(-2, 2, 6, -7);

        Vector result = v1.subtract(v2);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
        assertEquals(expectedResult.getW(), result.getW());
    }

    @Test
    void multiplyOnScalar() {
        Vector v1 = new Vector4(1, 2, 8, 0);
        double scalar = 5;
        Vector expectedResult = new Vector4(5, 10, 40, 0);

        Vector result = v1.multiplyOnScalar(scalar);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
        assertEquals(expectedResult.getW(), result.getW());
    }

    @Test
    void divisionOnScalar() {
        Vector v1 = new Vector4(1, 5, 0, 10);
        double scalar = 5;
        Vector expectedResult = new Vector4(0.2, 1, 0, 2);

        Vector result = v1.divisionOnScalar(scalar);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
        assertEquals(expectedResult.getW(), result.getW());
    }

    @Test
    void length() {
        Vector v1 = new Vector4(1, 4, 2, 2);
        double expectedResult = 5;

        double result = v1.length(v1);

        assertEquals(expectedResult, result);
    }

    @Test
    void normalize() {
        Vector v1 = new Vector4(1, 4, 2, 2);
        Vector expectedResult = new Vector4(0.2, 0.8, 0.4, 0.4);

        Vector result = v1.normalize(v1);

        assertEquals(expectedResult.getX(), result.getX());
        assertEquals(expectedResult.getY(), result.getY());
        assertEquals(expectedResult.getZ(), result.getZ());
        assertEquals(expectedResult.getW(), result.getW());
    }

    @Test
    void scalarProduct() {
        Vector v1 = new Vector4(1, 2, 7, 4);
        Vector v2 = new Vector4(4, 5, 6, 0);
        double expectedResult = 56;

        double result = v1.scalarProduct(v2);

        assertEquals(expectedResult, result);
    }


}