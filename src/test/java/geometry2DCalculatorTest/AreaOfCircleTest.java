package geometry2DCalculatorTest;

import geometry2DCalculator.AreaOfCircle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AreaOfCircleTest {
    AreaOfCircle circle;

    @Before
    public void init() {
        circle = new AreaOfCircle(50.1);
    }

    @Test
    public void checkAreaOfCircle() {
        Assert.assertEquals(7885.429, circle.getAreaOfCircle(), 0.01);
    }
}
