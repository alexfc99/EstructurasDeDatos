import java.util.*;

public class Telefonos {
    public static String telefonos(Map<String, String> telefonosYContactos, String contacto) {
        return telefonosYContactos.get(contacto);
    }
    public static void main(String[] args) {

        Map<String, String> telefonosYContactos = new HashMap<>();
        String contacto = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un contacto: ");
        contacto = scanner.next();
        telefonosYContactos.put("Pedro", "610803298");
        telefonosYContactos.put("Maria", "672098722");
        telefonosYContactos.put("Juan", "678142352");
        telefonosYContactos.put("Laura", "644989232");

        if (telefonosYContactos.containsKey(contacto)){
            System.out.println("Su número de teléfono es: " + telefonos(telefonosYContactos, contacto));
        }else {
            System.out.println("El contacto no está en la lista.");
        }

    }
}
