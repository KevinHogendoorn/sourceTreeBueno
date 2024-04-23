import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void testConElNumero_1(){
        assertEquals("1", FizzBuzz.comprobarNumero(1));
    }

    @Test
    public void testConElNumero_2(){
        assertEquals("2", FizzBuzz.comprobarNumero(2));
    }

    @Test
    public void testConElNumero_3(){
        assertEquals("Fizz", FizzBuzz.comprobarNumero(3));
    }

    @Test
    public void testConElNumero_4(){
        assertEquals("4", FizzBuzz.comprobarNumero(4));
    }

    @Test
    public void testConElNumero_5(){
        assertEquals("Buzz", FizzBuzz.comprobarNumero(5));
    }

    @Test
    public void testConElNumero_6(){
        assertEquals("Fizz", FizzBuzz.comprobarNumero(6));
    }

    @Test
    public void testConElNumero_7(){
        assertEquals("7", FizzBuzz.comprobarNumero(7));
    }

    @Test
    public void testConElNumero_8(){
        assertEquals("8", FizzBuzz.comprobarNumero(8));
    }

    @Test
    public void testConElNumero_9(){
        assertEquals("Fizz", FizzBuzz.comprobarNumero(9));
    }

    @Test
    public void testConElNumero_10(){
        assertEquals("Buzz", FizzBuzz.comprobarNumero(10));
    }

    @Test
    public void testConElNumero_11(){
        assertEquals("11", FizzBuzz.comprobarNumero(11));
    }

    @Test
    public void testConElNumero_12(){
        assertEquals("Fizz", FizzBuzz.comprobarNumero(12));
    }

    @Test
    public void testConElNumero_13(){
        assertEquals("13", FizzBuzz.comprobarNumero(13));
    }

    @Test
    public void testConElNumero_14(){
        assertEquals("14", FizzBuzz.comprobarNumero(14));
    }

    @Test
    public void testConElNumero_15() {
        assertEquals("FizzBuzz", FizzBuzz.comprobarNumero(15));
    }
}