import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Anagrama {

    public static void main(String[] args) throws IOException {
        int minGroupSize = 5;
        HashMap<String, ArrayList<String>> anagrama = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10472056/T7/spanish-dict.txt"));
        String line;
        while ((line = reader.readLine())!=null) {
            String alfa = alfabetizar(line);
            ArrayList<String> palabra = anagrama.get(alfa);
            if (palabra == null){
                palabra = new ArrayList<>();
                palabra.add(line);
                anagrama.put(alfa, palabra);
            }else {
                palabra.add(line);
            }
        }
        reader.close();

        for (ArrayList<String> palabra : anagrama.values()){
            if (palabra.size() >= minGroupSize){
                System.out.println(palabra.size() + " : " + palabra);
            }
        }
    }

    private static String alfabetizar(String p){
        char[] x = p.toCharArray();
        Arrays.sort(x);
        return new String(x);
    }
}
