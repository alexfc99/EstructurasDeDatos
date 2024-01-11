import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static HashMap<Integer, String > repartir(int participantes, int ... billetes) {
        HashMap<Integer, String> reparte = new HashMap<>();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int billete : billetes){
            lista.add(billete);
        }
        do {
            for (int i = 0; i < participantes; i++) {
                int a = lista.get(0);
                if (reparte.containsKey(i)){
                    reparte.replace(i, reparte.get(i) + ", " + a);
                }else reparte.put(i, String.valueOf(a));
                lista.remove(0);
                if (lista.isEmpty()){
                    break;
                }
            }
        }while (!lista.isEmpty());

        return reparte;
    }
        public static void main(String[] args) {

            System.out.println(repartir(2, 10, 20, 50, 200, 500));

        }
}
