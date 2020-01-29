package geometry2DCalculatorTest;

import geometry2DCalculator.ParallelogramArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParallelogramAreaTest {
    ParallelogramArea parallelogram;

    @Before
    public void init() {
        parallelogram = new ParallelogramArea(63, 45);
    }

    @Test
    public void checkParallelogramArea() {
        Assert.assertEquals(2835, parallelogram.getParallelogramArea(), 0.001);
    }
}
