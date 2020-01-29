package geometry2DCalculatorTest;

import geometry2DCalculator.AreaOfTriangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AreaOfTriangleTest {
    AreaOfTriangle triangle;

    @Before
    public void init() {
        triangle = new AreaOfTriangle(16.2, 23.7, 17.23);
    }


    @Test
    public void checkAreaOfTriangle() {
        Assert.assertEquals(28.564999999999998, triangle.getAreaOfTriangle(), 0.00000001);

    }

}
