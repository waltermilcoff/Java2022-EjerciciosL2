import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entradaPorConsola = new Scanner(System.in);

        ArrayList<Integer> arrayListNumEnteros = new ArrayList<Integer>();

        System.out.println("Ingresa una lista de 5 numeros, ingresando de a uno por vez: ");
        for (int i = 1; i <= 5; i++) {
            arrayListNumEnteros.add(entradaPorConsola.nextInt());
        }

        ArrayList<Integer> CopiaListaOriginaria = new ArrayList<>(arrayListNumEnteros);

        System.out.println("Ingresa UN numero para agregar al COMIENZO de la lista: ");

        arrayListNumEnteros.add(0, entradaPorConsola.nextInt());

        System.out.println("Ingresa UN numero para agregarlo al FINAL de la lista: ");

        arrayListNumEnteros.add(6, entradaPorConsola.nextInt());

        entradaPorConsola.close();

        System.out.println("Los elementos de la lista originaria son: ");

        for (int i = 0; i < 5; i++) {
            if (i != 4) {
                System.out.print(CopiaListaOriginaria.get(i) + " - ");
            } else {
                System.out.print(CopiaListaOriginaria.get(i));
            }
        }

        System.out.println(" Los numeros ingresados en la lista originaria son: " + CopiaListaOriginaria.size());

        System.out.println("La lista con los numeros agregados adelante y al final, queda así: ");

        for (int i = 0; i < 7; i++) {
            if (i != 6) {
                System.out.print(arrayListNumEnteros.get(i) + " - ");
            } else {
                System.out.print(arrayListNumEnteros.get(i));
            }
        }
        System.out.println(" Cantidad de numeros en la lista modificada es: " + arrayListNumEnteros.size());
    }

}