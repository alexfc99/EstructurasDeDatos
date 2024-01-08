import java.util.*;

public class PaisCapital {
    public static String paisCapital(Map<String, String> paisesYCapitales, String pais) {
        return paisesYCapitales.get(pais);
    }
    public static void main(String[] args) {

        Map<String, String> paisesYCapitales = new HashMap<>();
        String pais = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un país: ");
        pais = scanner.next();
            paisesYCapitales.put("España", "Madrid");
            paisesYCapitales.put("Francia", "Paris");
            paisesYCapitales.put("Portugal", "Lisboa");
            paisesYCapitales.put("Italia", "Roma");

            if (paisesYCapitales.containsKey(pais)){
                System.out.println(paisCapital(paisesYCapitales, pais));
            }else {
                System.out.println("El país no está en la lista.");
            }

    }
}