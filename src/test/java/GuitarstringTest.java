import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarstringsTest {

    GuitarStrings guitarstrings;

    @Before
    public void before(){
        guitarstrings = new GuitarStrings("E A D G B", 10, 5);
    }

    @Test
    public void getName() {
        assertEquals("E A D G B", guitarstrings.getName());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(10, guitarstrings.getSellingPrice());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(5, guitarstrings.getBuyingPrice());
    }
}
