import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static String repartir(int participantes, int ... billetes) {
        HashMap<Integer, ArrayList<Integer>> reparte = new HashMap<>();
        for (int i = 0; i < billetes.length; i++) {
            ArrayList<Integer> lista = new ArrayList<>();

            lista.add(billetes[i]);
            reparte.put(i, lista);
        }
        return reparte.toString();
    }
        public static void main(String[] args) {

            System.out.println(repartir(2, 10, 20, 50, 200, 500));

        }
}
