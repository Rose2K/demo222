import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
package medipol;

public class HesaplamaTest {

    Hesaplama hesaplama = new Hesaplama();

    @Test
    public void testTopla() {
        assertEquals(5, hesaplama.topla(2, 3));
        assertEquals(0, hesaplama.topla(-2, 2));
    }

    @Test
    public void testCikar() {
        assertEquals(1, hesaplama.cikar(3, 2));
        assertEquals(-4, hesaplama.cikar(-2, 2));
    }

    @Test
    public void testBol() {
        assertEquals(2, hesaplama.bol(6, 3));
        assertThrows(IllegalArgumentException.class, () -> hesaplama.bol(1, 0));
    }


  
}
  