import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTDDTest {
    @Test
    public void testDevuelve0(){
        assertEquals("0", OperacionesTDD.suma(""));
    }

    @Test
    public void testDevuelve1(){
        assertEquals("1", OperacionesTDD.suma("1"));
    }
}