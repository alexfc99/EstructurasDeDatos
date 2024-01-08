import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CountCountries {

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> contar = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10472056/T7/Colfuturo-Seleccionados.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
           String[] dividir = line.split(",");
           String pais = dividir[6];
            int rep = 1;
            if (contar.containsKey(pais)){
                rep = contar.get(pais) + 1;
            }
            contar.put(pais, rep);
        }
        reader.close();
        System.out.println(contar);
    }
}