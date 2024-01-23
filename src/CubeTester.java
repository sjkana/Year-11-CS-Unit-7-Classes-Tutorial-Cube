import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class CubeTester {

    @Test
    public void TestNoArgumentConstructorNoException() {
        MaiN.Cube cube = new MaiN.Cube();
        assertTrue(cube.getSide() == 1, "Ensure that your no argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNoException() {
        MaiN.Cube cube = new MaiN.Cube(5);
        assertTrue(cube.getSide() == 5, "Ensure that your single argument constructor has been implemented correctly!");
    }


    @Test
    public void TestSingleArgumentConstructorNegative() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new MaiN.Cube(-1);
        });
    }


    @Test
    public void TestSingleArgumentConstructorZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new MaiN.Cube(0);
        });
    }

    @Test
    public void TestSetter() {
        MaiN.Cube cube = new MaiN.Cube(5);
        cube.setSide(7);
        assertTrue(cube.getSide() == 7, "Ensure that your setter method has been implemented correctly!");
    }

    @Test
    public void TestSetterNegative() {
        MaiN.Cube cube = new MaiN.Cube(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            cube.setSide(-1);
        });
    }

    @Test
    public void TestSetterZero() {
        MaiN.Cube cube = new MaiN.Cube(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            cube.setSide(0);
        });
    }


    @Test
    public void TestVolume() {
        MaiN.Cube cube = new MaiN.Cube(5);
        int volume = cube.getVolume();
        assertTrue(volume == 125, "Ensure that your getVolume method has been implemented correctly!");
    }


    @Test
    public void TestVolumeTwo() {
        MaiN.Cube cube = new MaiN.Cube(7);
        int volume = cube.getVolume();
        assertTrue(volume == 343, "Ensure that your getVolume method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceArea() {
        MaiN.Cube cube = new MaiN.Cube(5);
        int surfaceArea = cube.getSurfaceArea();
        assertTrue(surfaceArea == 150, "Ensure that your getSurfaceArea method has been implemented correctly!");
    }


    @Test
    public void TestSurfaceAreaTwo() {
        MaiN.Cube cube = new MaiN.Cube(7);
        int surfaceArea = cube.getSurfaceArea();
        assertTrue(surfaceArea == 294, "Ensure that your getSurfaceArea method has been implemented correctly!");
    }

}


