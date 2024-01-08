import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static HashMap<String, Integer> frequency(ArrayList<String> palabras){
        HashMap<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras){
            int rep = 1;
            if (frecuencia.containsKey(palabra)){
                rep = frecuencia.get(palabra) + 1;
            }
            frecuencia.put(palabra, rep);
        }
        return frecuencia;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("Introduzca varias palabras (línea vacía para acabar)");
        String palabra;
        while (scanner.hasNextLine()){
            palabra = scanner.nextLine();
            if (palabra.isBlank()){
                break;
            }
            palabras.add(palabra);
        }
        System.out.println(frequency(palabras));
    }
}
