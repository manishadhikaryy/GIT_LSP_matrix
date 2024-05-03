package org.howard.edu.lsp.oopfinal.question3;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ShapeTest {
    @Test
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("circle");
        assertNotNull(circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        assertNotNull(rectangle);
    }
}
