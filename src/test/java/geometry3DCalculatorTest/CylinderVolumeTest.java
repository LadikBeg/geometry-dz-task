package geometry3DCalculatorTest;

import geometry3DCalculator.CylinderVolume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CylinderVolumeTest {
    CylinderVolume cylinder;

    @Before
    public void init() {
        cylinder = new CylinderVolume(12, 5);
    }

    @Test
    public void checkCylinderVolume() {
        Assert.assertEquals(2261.946710584651, cylinder.getCylinderVolume(), 0.0000000001);
    }

}
