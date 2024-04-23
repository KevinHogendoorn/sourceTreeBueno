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
}