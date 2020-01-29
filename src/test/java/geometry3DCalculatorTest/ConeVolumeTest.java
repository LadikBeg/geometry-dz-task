package geometry3DCalculatorTest;

import geometry3DCalculator.ConeVolume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConeVolumeTest {
    ConeVolume cone;

    @Before
    public void init() {
        cone = new ConeVolume(15, 6);
    }

    @Test
    public void checkConeVolume() {
        Assert.assertEquals(1413.7166941154069, cone.getConeVolume(), 0.0000001);

    }
}
