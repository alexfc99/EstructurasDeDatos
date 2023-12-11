import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertirAArray {
    public static String convertirAArray(ArrayList<String> sinConvertir){
        String[] convertido = new String[sinConvertir.size()];
        for (int i = 0; i < sinConvertir.size(); i++) {
            convertido[i] = sinConvertir.get(i);
        }
        return Arrays.toString(convertido);
    }
    public static void main(String[] args) {

        ArrayList<String> sinConvertir = new ArrayList<>();
        sinConvertir.add("Hola");
        sinConvertir.add("Adiós");
        sinConvertir.add("Buenos días");
        sinConvertir.add("Buenas noches");

        System.out.println(convertirAArray(sinConvertir));
    }
}
