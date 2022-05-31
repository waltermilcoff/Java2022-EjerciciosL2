import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<String> Alumnos = new ArrayList<String>(Arrays.asList("Walter", "German", "Marina", "Soledad", "Lautaro",
                "Francisco", "Javier", "Ismael", "Sandra", "Susana", "Lucas", "Mateo"));

        List<String> curso1 = Alumnos.subList(0, 4);
        List<String> curso2 = Alumnos.subList(4, 8);
        List<String> curso3 = Alumnos.subList(8, 12);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    }

}
