/**
 * Brattsev_Chapter9_Assignment1.java
 * COP 2250 -- Chapter 9, Assignment 1
 */

// ============================================================
// Rectangle_AB class -- NO public keyword
// ============================================================
class Rectangle_AB {

    // STEP 1: data fields
    double width = 1;
    double height = 1;

    // STEP 2: no-arg constructor
    Rectangle_AB() {
    }

    // STEP 3: parameterized constructor
    Rectangle_AB(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // STEP 4: getArea
    double getArea() {
        return width * height;
    }

    // STEP 5: getPerimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}


// ============================================================
// Test class (public)
// ============================================================
public class Brattsev_Chapter9_Assignment1 {

    public static void main(String[] args) {

        // STEP 6: rectangle 1
        Rectangle_AB r1 = new Rectangle_AB(4, 40);

        // STEP 7: print r1
        System.out.println("Rectangle 1");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println();

        // STEP 8: rectangle 2
        Rectangle_AB r2 = new Rectangle_AB(3.5, 35.9);

        // STEP 9: print r2
        System.out.println("Rectangle 2");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}