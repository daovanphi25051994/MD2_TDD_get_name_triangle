public class TriangleClassifier {

    public static final String EQUILATERAL_TRIANGLE = "equilateral triangle";
    public static final String ISOSCELES_TRIANGLE = "isosceles triangle";
    public static final String NORMAL_TRIANGLE = "normal triangle";
    public static final String NOT_A_TRIANGLE = "not a triangle";

    public static String getNameTriangle(int side1, int side2, int side3) {
        String nameTriangle = NOT_A_TRIANGLE;
        if (isTriangle(side1, side2, side3)) {
            if (side1 == side2 && side1 == side3) {
                nameTriangle = EQUILATERAL_TRIANGLE;
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                nameTriangle = ISOSCELES_TRIANGLE;
            } else {
                nameTriangle = NORMAL_TRIANGLE;
            }
            return nameTriangle;
        }
        return nameTriangle;
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        if (side1 > 0 && side2 > 0 && side3 > 0 && (side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            return true;
        }
        return false;
    }
}
