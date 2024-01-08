import java.util.*;

public class TelefonosII {
    public static String telefonos(Map<String, ArrayList<String>> telefonosYContactos, String contacto) {
        return String.valueOf(telefonosYContactos.get(contacto));
    }
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        Map<String, ArrayList<String>> telefonosYContactos = new HashMap<>();
        String contacto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un contacto: ");
        contacto = scanner.next();

        telefonos.add("610803298");
        telefonos.add("677498209");

        telefonosYContactos.put("Juan", telefonos);

        telefonos = new ArrayList<>();

        telefonos.add("689020345");
        telefonos.add("629399124");

        telefonosYContactos.put("Maria", telefonos);

        telefonos = new ArrayList<>();

        telefonos.add("699203492");
        telefonos.add("662783193");

        telefonosYContactos.put("Pedro", telefonos);

        telefonos = new ArrayList<>();

        telefonos.add("612445834");

        telefonosYContactos.put("Laura", telefonos);

        if (telefonosYContactos.containsKey(contacto)){
            System.out.println("Su número/s de teléfono es: " + telefonos(telefonosYContactos, contacto));
        }else {
            System.out.println("El contacto no está en la lista.");
        }
    }
}
