package org.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    @Test
    void CircleTest() {
        Shape s1 = new Circle(15);
        assertEquals(707, s1.getArea());
        assertEquals(94, s1.getPerimeter());
    }

    @Test
    void RectangleTest() {
        Shape s2 = new Rectangle(10, 15);
        assertEquals(150, s2.getArea());
        assertEquals(50, s2.getPerimeter());
    }

    @Test
    void SquareTest() {
        Shape s3 = new Square(10);
        assertEquals(100, s3.getArea());
        assertEquals(40, s3.getPerimeter());
    }

    @Test
    void getArea() {
        Circle s1 = new Circle(15);
        Shape s2 = new Rectangle(10, 15);
        Shape s3 = new Square(10);

        assertEquals(707, s1.getArea());
        assertEquals(150, s2.getArea());
        assertEquals(100, s3.getArea());
    }

    @Test
    void getPerimeter() {
        Circle s1 = new Circle(10);
        Shape s2 = new Rectangle(10, 15);
        Shape s3 = new Square(10);

        assertEquals(50, s2.getPerimeter());
        assertEquals(40, s3.getPerimeter());
        assertEquals(314, s1.getArea());
    }

    @Test
    void testExceptions() {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Square();

        assertThrows(IllegalArgumentException.class, () -> new Circle(-16));
        assertThrows(IllegalArgumentException.class, () -> new Square(-1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 9));
    }
}