import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("White", "Wood", "Baby Grand Piano");
    }

    @Test
    public void getColour() {
        assertEquals("White", piano.getColor());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }
//
    @Test
    public void getType() {
        assertEquals("Baby Grand Piano", piano.getType());

    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }
}
