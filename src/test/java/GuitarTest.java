import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Blue", "Wood", "Classical Guitar");

        }

    @Test
    public void getColor() {
        assertEquals("Blue", guitar.getColor());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals("Classical Guitar", guitar.getType());
    }

    @Test
    public void getNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
}

