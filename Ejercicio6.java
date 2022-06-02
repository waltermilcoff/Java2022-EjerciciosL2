import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        HashSet<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleado.add(new Empleado("Walter", 28498345, 90, 10));
        empleado.add(new Empleado("Soledad", 28661101, 70, 20));
        empleado.add(new Empleado("Horacio", 27896741, 100, 15));
        
        System.out.println("Lista de Empleados");

        for (Empleado lista : empleado) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - horas trabajadas: " + lista.horasTrabajadas
                    + " - salario x hora: " + lista.valorHora);
        }

        for (Empleado creartabla : empleado) {
            sueldo.put(creartabla.clave(), creartabla.valor());
        }
        System.out.println("Sueldos Calculados:");
        sueldo.forEach((dni, valor) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + valor));
    }
}

class Empleado {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float valorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorHora;
    }
}