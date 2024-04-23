
public class OperacionesTDD {
    public static String suma(String numeros){
        String[] numeroSuma = numeros.split(",");
        int suma = 0;
        if (numeros.length() > 0){
            for (int i = 0; i < numeroSuma.length; i++) {
                if (numeroSuma[i] != null){
                    suma += Integer.parseInt(numeroSuma[i]);
                }
            }
        } else {
            return "0";
        }

        return String.valueOf(suma);
    }
}
