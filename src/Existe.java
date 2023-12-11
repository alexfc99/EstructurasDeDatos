import java.util.ArrayList;

public class Existe {
    public static boolean siExiste(ArrayList<String> cadenas, String busca){
            return (cadenas.contains(busca));
    }
    public static void main(String[] args) {

        String busca = Utilidades.leerCadena("Introduce una fruta a buscar: ");

        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Manzanas");
        cadenas.add("Peras");
        cadenas.add("Plátanos");
        cadenas.add("Naranjas");

        if (siExiste(cadenas, busca)){
            System.out.println("El elemento si existe.");
        }else {
            System.out.println("El elemento no existe.");
        }
    }
}
