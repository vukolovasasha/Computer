

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CustomerTest
{
    @Test
    public void testNoMoney()
    {
        Customer c;
        c = new Customer("Max Mustermann", -10);
        assertEquals(c.getGeld(), 1000);
    }    
    
    @Test
    public void testEnoughMoney()
    {
    
        Customer c;
        c = new Customer("Max Mustermann", 500);
        assertEquals(c.getGeld(),500);
    }
    @Test
    public void testTooMuchMoney()
    {
        Customer c;
        c = new Customer("Max Mustermann", 7000);
        assertEquals(c.getGeld(), 1000);
    
    }
  
    
}