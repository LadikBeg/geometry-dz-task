package geometry3DCalculatorTest;

import geometry3DCalculator.TetrahedronVolume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TetrahedronVolumeTest {

    TetrahedronVolume tetrahedron;

    @Before
    public void unit() {
        tetrahedron = new TetrahedronVolume(12, 42, 12, 53, 12, 74, 32, 23, 12);
    }

    @Test
    public void checkTetrahedronVolume() {
        Assert.assertEquals(10678, tetrahedron.getTetrahedronVolume(), 0.0001);
    }
}
