import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LastName {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> contar = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10472056/T7/LastnameFrequencies.csv"));
        Scanner scanner = new Scanner(System.in);
        String line;
        String apellido;
        String numero;

        System.out.println("Introduce un apellido: (Línea en blanco para finalizar)");
        while ((line = reader.readLine()) != null) {
            String[] dividir = line.split(",");
            if (dividir.length == 2){
                apellido = dividir[0];
                numero = dividir[1];
                numero = numero.replaceAll("\\.", "");
                contar.put(apellido, numero);
            }
        }
        while (scanner.hasNextLine()){
            apellido = scanner.nextLine();
            if (apellido.isBlank()){
                break;
            }
            System.out.println(contar.get(apellido));
        }
        reader.close();
    }
}