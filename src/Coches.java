import java.util.ArrayList;
import java.util.Collections;

public class Coches {
    public static String coches(ArrayList<String>coches){
        //OK
        String res = "";
        Collections.sort(coches);
        for(String coche  : coches){
            res += coche + "\n";
        }
        return res;
    }
    public static void main(String[] args) {

        ArrayList<String>coches = new ArrayList<>();
        String coche;
        do {
            coche = Utilidades.leerCadena("Introduzca un coche (línea vacía para acabar)" );
            coches.add(coche);
        }while (coche.length() != 0);
        Collections.sort(coches);
        System.out.println(coches(coches));
    }
}
