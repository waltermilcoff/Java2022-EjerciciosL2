import java.util.ArrayList;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        List<String> listaCartas = new ArrayList<String>(
                Arrays.asList("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"));

        List<String> listaCartasInvertidas = new ArrayList<>(listaCartas);
        Collections.reverse(listaCartasInvertidas);

        List<String> listaCartasDesordenadas = new ArrayList<>(listaCartas);
        Collections.shuffle(listaCartasDesordenadas);

        System.out.println("Cartas en orden: ");
        for (int i = 0; i < listaCartas.size(); i++) {
            System.out.println(listaCartas.get(i) + " ");
        }
        System.out.println("Cartas en orden inverso: ");
        for (int i = 0; i < listaCartas.size(); i++) {
            System.out.println(listaCartasInvertidas.get(i) + " ");
        }
        System.out.println("Cartas desordenadas: ");
        for (int i = 0; i < listaCartas.size(); i++) {
            System.out.println(listaCartasDesordenadas.get(i) + " ");
        }
    }
}