import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("side(2 2 2)")
    void testGetNameTriangle() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expectedName = TriangleClassifier.EQUILATERAL_TRIANGLE;
        String actualName = TriangleClassifier.getNameTriangle(side1, side2, side3);
        assertEquals(expectedName, actualName);
    }

    @Test
    @DisplayName("side(2 2 3)")
    void testGetNameTriangle1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expectedName = TriangleClassifier.ISOSCELES_TRIANGLE;
        String actualName = TriangleClassifier.getNameTriangle(side1, side2, side3);
        assertEquals(expectedName, actualName);
    }

    @Test
    @DisplayName("side(3 4 5)")
    void testGetNameTriangle2() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expectedName = TriangleClassifier.NORMAL_TRIANGLE;
        String actualName = TriangleClassifier.getNameTriangle(side1, side2, side3);
        assertEquals(expectedName, actualName);
    }

    @Test
    @DisplayName("side(8 2 3)")
    void testGetNameTriangle3() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expectedName = TriangleClassifier.NOT_A_TRIANGLE;
        String actualName = TriangleClassifier.getNameTriangle(side1, side2, side3);
        assertEquals(expectedName, actualName);
    }

    @Test
    @DisplayName("side(-1 2 1)")
    void testGetNameTriangle4() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expectedName = TriangleClassifier.NOT_A_TRIANGLE;
        String actualName = TriangleClassifier.getNameTriangle(side1, side2, side3);
        assertEquals(expectedName, actualName);
    }

    @Test
    @DisplayName("side(0 1 1)")
    void testGetNameTriangle5() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expectedName = TriangleClassifier.NOT_A_TRIANGLE;
        String actualName = TriangleClassifier.getNameTriangle(side1, side2, side3);
        assertEquals(expectedName, actualName);
    }
}