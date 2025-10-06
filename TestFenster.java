

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFenster
{
    @Test
    public void testGering()
    {
        // 198
        Fenster f;
        
        f = new Fenster("Alu", 198, true);
        // Fehler
        assertEquals(499, f.getPreis());
    }
    
    @Test
    public void testOK()
    {
        Fenster f;
        f = new Fenster("Alu", 375, true);
        assertEquals(375, f.getPreis());
    }
    
    @Test
    public void testHoch()
    {
        Fenster f;
        f = new Fenster("Alu", 900, true);
        // Fehler
        assertEquals(499, f.getPreis());
    }
}