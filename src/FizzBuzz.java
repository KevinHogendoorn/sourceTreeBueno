public class FizzBuzz {
    public static String comprobarNumero(int num){
        int devuelveFizz = num % 3;
        int devuelveBuzz = num % 5;
        String cadena = String.valueOf(num);
        if (devuelveFizz == 0) return "Fizz";
        if (devuelveBuzz == 0) return "Buzz";
        if (devuelveFizz == 0 && devuelveBuzz == 0) return "FizzBuzz";
        return cadena;
    }
}