import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Loteria {
    public static HashMap<Integer, Integer> loteria(ArrayList<String> boletos){
        HashMap<Integer, Integer> contador = new HashMap<>();

        for (String boleto : boletos){
            int repeticion = 1;
            int ultnum = Integer.parseInt("" + boleto.charAt(boleto.length() - 1));
            if (contador.containsKey(ultnum)){
                repeticion = contador.get(ultnum) + 1;
            }
            contador.put(ultnum, repeticion);
        }
        return contador;
    }
    public static void main(String[] args) {

        ArrayList<String> boletos = new ArrayList<>();

        boletos.add("05670");
        boletos.add("77283");
        boletos.add("22933");
        boletos.add("57291");

        System.out.println(loteria(boletos));
    }
}
