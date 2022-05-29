import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        Scanner entradaPorConsola = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Ingresa una ciudad: (para finalizar presionar -0- y luego la tecla -enter-)");
            ciudades.add(entradaPorConsola.nextLine());
            if (Objects.equals(ciudades.get(ciudades.size() - 1), "0")) {
                flag = false;
            }
            
        }

        while (flag);

        for (int i = 0; i < ciudades.toArray().length - 1; i++) {
            System.out.printf("#%d - %s%n", (i + 1), ciudades.get(i));
        }
        ciudades.remove(ciudades.size() - 1);

        entradaPorConsola.close();

    }
}